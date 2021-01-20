package Utilidades;

import java.io.File;
import java.net.URL;

public class R {

    public static void bucleHilo(String texto, double segundos) {

        double time = segundos * 1000;

        for (int i = 0; i < 10; i++) {

            System.out.println(texto);

            if (time != 0) {
                try {
                    Thread.sleep((long) time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }

    }



    /**
     * Devuelve la URL donde se encuentra el fxml
     * @param nombre
     * @return
     */
    public static URL getURL(String nombre) {
        return Thread.currentThread().getContextClassLoader().getResource("interfaz" + File.separator + nombre);
    }

}
