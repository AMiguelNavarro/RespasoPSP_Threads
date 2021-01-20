package Ejercicio2;

import Ejercicio1.Hilo;

public class Principal {

    public static void main(String[] args) {

        /* SE REUTILIZA LA CLASE HILO DEL EJERCICIO 1 YA QUE ES IGUAL */
        Hilo hilo1 = new Hilo(1,1,10);
        Hilo hilo2 = new Hilo(11,1,10);

        hilo1.start();
        try {
            hilo1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hilo2.start();
        try {
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fin de la ejecución");
    }


}
