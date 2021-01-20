package Ejercicio1;

public class Principal {

    public static void main(String[] args) {

        Hilo hilo1 = new Hilo(2, 0.5, 10);
        Hilo hilo2 = new Hilo(13, 0.5, 10);

        hilo1.start();
        hilo2.start();

    }

}
