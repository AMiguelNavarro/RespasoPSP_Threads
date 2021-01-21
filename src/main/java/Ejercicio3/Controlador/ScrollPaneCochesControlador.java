package Ejercicio3.Controlador;

import Ejercicio3.Beans.Coche;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.net.URL;
import java.util.ResourceBundle;

public class ScrollPaneCochesControlador implements Initializable {

    public Label lbProgreso, lbNombreCoche, lbVelocidad;
    public ProgressBar pbProgreso;

    private Coche coche;

    public ScrollPaneCochesControlador(Coche coche) {
        this.coche = coche;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lbNombreCoche.setText(coche.getNombre());
        lbVelocidad.setText(coche.getVelocidad() + " Km/h");
    }
}
