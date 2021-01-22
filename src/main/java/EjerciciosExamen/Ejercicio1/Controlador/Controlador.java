package EjerciciosExamen.Ejercicio1.Controlador;

import EjerciciosExamen.Ejercicio1.Hilo.HiloTask;
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

public class Controlador implements Initializable {

    public ProgressBar pbProgreso;
    public Label lbProgreso;
    public TextField tfTiempo;
    public Button btIniciar, btCancelar;

    private HiloTask task;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        modoCancelado(true);
    }


    @FXML
    public void iniciar(Event event) {

        int tiempo = Integer.parseInt(tfTiempo.getText());

        task = new HiloTask(tiempo);

        task.stateProperty().addListener((observableValue, viejoEstado, nuevoEstado) -> {
            if (nuevoEstado == Worker.State.SUCCEEDED) {
                Alertas.mostrarInformacion("Cuenta atrás finalizada");
                modoCancelado(true);
            }

            if (nuevoEstado == Worker.State.RUNNING) {
                pbProgreso.progressProperty().unbind();
                pbProgreso.progressProperty().bind(task.progressProperty());
            }

            if (nuevoEstado == Worker.State.CANCELLED) {
                lbProgreso.setText("Cuenta atrás cancelada");
            }
        });


        task.messageProperty().addListener((observableValue, viejoValor, nuevoValor) -> {
            lbProgreso.setText(nuevoValor);
        });


        new Thread(task).start();

        modoIniciado(true);
    }

    @FXML
    public void cancelar(Event event) {
        task.cancel();
        modoCancelado(true);
    }


    public void modoIniciado(boolean verdadero){
        btIniciar.setDisable(verdadero);
        btCancelar.setDisable(!verdadero);
    }

    public void modoCancelado(boolean verdadero){
        btIniciar.setDisable(!verdadero);
        btCancelar.setDisable(verdadero);
    }

}
