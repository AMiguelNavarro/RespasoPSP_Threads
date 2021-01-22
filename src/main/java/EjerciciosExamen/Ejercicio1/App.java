package EjerciciosExamen.Ejercicio1;

import EjerciciosExamen.Ejercicio1.Controlador.Controlador;
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
        loader.setLocation(R.getURL("ejExamen_ej1.fxml"));

        Controlador controlador = new Controlador();
        loader.setController(controlador);

        Parent root = loader.load();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}
