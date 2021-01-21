package Ejercicio4.Controlador;

import Ejercicio4.Task.CuentaAtrasTask;
import javafx.concurrent.Worker;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CuentaAtrasControlador {

    public Label lbNumero;
    public TextField tfNumero;
    public Button btIniciar;



    @FXML
    public void iniciar(Event event) {
        int numero = Integer.parseInt(tfNumero.getText());
        CuentaAtrasTask hilo = new CuentaAtrasTask(numero);

        hilo.messageProperty().addListener((observableValue, viejo, nuevo) -> {
            lbNumero.setText(nuevo);
        });

        new Thread(hilo).start();
    }

}
