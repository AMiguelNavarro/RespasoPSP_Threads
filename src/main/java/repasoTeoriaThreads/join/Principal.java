package repasoTeoriaThreads.join;

import Hilos.Hilo;

public class Principal {

    public static void main(String [] args){

        Hilo hilo1 = new Hilo("primero");
        Hilo hilo2 = new Hilo("segundo");

        /**
         * Con los repasoTeoriaThreads.join se controla la prioridad
         */
        hilo1.start();
        try {
            hilo1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo2.start();

        try {
            hilo2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Fin de la ejecución");

    }




}
