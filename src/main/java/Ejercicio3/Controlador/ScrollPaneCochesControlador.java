package Ejercicio3.Controlador;

import Ejercicio3.Beans.Coche;
import Ejercicio3.Hilo.CarreraTask;
import javafx.concurrent.Worker;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.net.URL;
import java.util.ResourceBundle;

public class ScrollPaneCochesControlador implements Initializable {

    public Label lbProgreso, lbNombreCoche, lbVelocidad;
    public ProgressBar pbProgreso;

    private Coche coche;
    private CarreraTask task;

    public ScrollPaneCochesControlador(Coche coche) {
        this.coche = coche;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lbNombreCoche.setText(coche.getNombre());
        lbVelocidad.setText(coche.getVelocidad() + " Km/h");
    }

    public void iniciarCarrera() {
        task = new CarreraTask(coche, InicioControlador.distanciaCircuito);

        task.messageProperty().addListener((observableValue, viejoValor, nuevoValor) ->  {
            lbProgreso.setText(nuevoValor);
        });

        task.stateProperty().addListener((observableValue, viejoEstado, nuevoEstado) ->  {
            if (nuevoEstado == Worker.State.SUCCEEDED) {
                task.cancel();
            }

            if (nuevoEstado == Worker.State.RUNNING) {
                pbProgreso.progressProperty().unbind();
                pbProgreso.progressProperty().bind(task.progressProperty());
            }
        });

        new Thread(task).start();
    }
}
