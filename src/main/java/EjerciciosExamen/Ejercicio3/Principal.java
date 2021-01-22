package EjerciciosExamen.Ejercicio3;

import EjerciciosExamen.Ejercicio3.Hilos.Hilo;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {


        Hilo hilo1 = new Hilo("PRIMERO");
        Hilo hilo2= new Hilo("SEGUNDO");
        Hilo hilo3 = new Hilo("TERCERO");
        Hilo hilo4 = new Hilo("CUARTO");

        Thread tarea1 = new Thread(hilo1);
        Thread tarea2 = new Thread(hilo2);
        Thread tarea3 = new Thread(hilo3);
        Thread tarea4 = new Thread(hilo4);

        tarea1.start();
        try {
            tarea1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tarea2.start();
        try {
            tarea2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tarea3.start();
        try {
            tarea3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tarea4.start();
        try {
            tarea4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("HILOS FINALIZADOS");

    }





}
