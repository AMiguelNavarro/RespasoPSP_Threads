package Ejercicio5;

import Ejercicio5.Controlador.CronometroControlador;
import Utilidades.R;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(R.getURL("ejercicio5.fxml"));

        CronometroControlador controlador = new CronometroControlador();
        loader.setController(controlador);

        Parent root = loader.load();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
