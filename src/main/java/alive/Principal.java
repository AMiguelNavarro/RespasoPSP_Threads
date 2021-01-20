package alive;

import Hilos.Hilo;

public class Principal {

    public static void main(String[] args) {

        Hilo hilo = new Hilo("Yo soy el hilo principal");
        Hilo hilo2 = new Hilo("Yo soy el hilo secundario");

        hilo.start();

        if (hilo.isAlive())
            hilo2.start();

    }

}
