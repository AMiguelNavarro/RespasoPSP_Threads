package Ejercicio3.Controlador;

import Ejercicio3.Beans.Coche;
import Ejercicio3.Hilo.CarreraTask;
import Utilidades.Alertas;
import Utilidades.R;
import javafx.concurrent.Worker;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.ArrayList;

public class InicioControlador {

    public Button btAnadir, btStart, btDistancia;
    public TextField tfNombreCoche, tfVelocidad, tfDistancia;
    public Label lbDistancia;
    public VBox layout;

    public static int distanciaCircuito;
    private int velocidad;
    private ArrayList<ScrollPaneCochesControlador> listaControladores = new ArrayList<>();
    private ScrollPaneCochesControlador controlador;

    @FXML
    public void iniciarCarrera(Event event) {

        for(ScrollPaneCochesControlador controlador : listaControladores) {
            controlador.iniciarCarrera();
        }

    }

    @FXML
    public void insertarCoche(Event event) {

        if (listaControladores.size() == 4) {
            Alertas.mostrarInformacion("No puedes añadir más de 4 coches");
            return;
        }

        String nombre = tfNombreCoche.getText();
        velocidad = Integer.parseInt(tfVelocidad.getText());
        Coche coche = new Coche(nombre, velocidad);

        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(R.getURL("nuevoCoche.fxml"));

            controlador = new ScrollPaneCochesControlador(coche);
            loader.setController(controlador);

            Parent root = loader.load();

            layout.getChildren().add(root);

            listaControladores.add(controlador);

        } catch (IOException e) {
            e.printStackTrace();
        }

        limpiarTextFields();

    }

    @FXML
    public void asignarDistancia(Event event) {

        distanciaCircuito = Integer.parseInt(tfDistancia.getText());
        lbDistancia.setText(distanciaCircuito + " Km");
        tfDistancia.setText("");
        tfDistancia.setDisable(true);
        btDistancia.setDisable(true);

    }

    public void limpiarTextFields() {
        tfNombreCoche.setText("");
        tfVelocidad.setText("");
        tfNombreCoche.requestFocus();
    }

}
