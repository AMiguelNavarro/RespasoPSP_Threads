package Utilidades;

import javafx.scene.control.Alert;

public class Alertas {

    public static void mostrarInformacion(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("INFORMACIÓN");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

}
