package Ejercicio5.Controlador;

import Ejercicio5.Task.CronometroTask;
import Utilidades.Alertas;
import javafx.concurrent.Worker;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CronometroControlador implements Initializable {

    public Label lbProgreso;
    public ProgressBar pbProgreso;
    public TextField tfNumero;
    public Button btIniciar, btParar;

    private int numero;
    private CronometroTask task;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        vistaContadorIniciado(false);
    }



    @FXML
    public void iniciar(Event event) {

        vistaContadorIniciado(true);

        numero = Integer.parseInt(tfNumero.getText());
        task = new CronometroTask(numero);

        task.stateProperty().addListener((observableValue, viejoEstado, nuevoEstado) -> {
            if (nuevoEstado == Worker.State.RUNNING) {
                pbProgreso.progressProperty().unbind();
                pbProgreso.progressProperty().bind(task.progressProperty());
            }

            if (nuevoEstado == Worker.State.SUCCEEDED){
                Alertas.mostrarInformacion("Finalizado!!");
                vistaContadorIniciado(false);
            }
        });

        task.messageProperty().addListener((observableValue, viejoValor, nuevoValor) -> {
            lbProgreso.setText(nuevoValor);
        });

        new Thread(task).start();
    }

    @FXML
    public void parar(Event event) {
        task.cancel();

        vistaContadorIniciado(false);
    }

    public void vistaContadorIniciado(boolean desactivar) {
        btIniciar.setDisable(desactivar);
        btParar.setDisable(!desactivar);
    }

}
