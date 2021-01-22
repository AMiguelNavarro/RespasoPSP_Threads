package EjerciciosExamen.Ejercicio2;

import EjerciciosExamen.Ejercicio2.Hilo.HiloAlive;
import EjerciciosExamen.Ejercicio2.Hilo.HiloNormal;

public class Principal {

    public static void main(String[] args) {

        HiloNormal hilo1 = new HiloNormal("NORMAL");
        HiloAlive hilo2 = new HiloAlive(hilo1);

        hilo1.start();
        hilo2.start();

    }

}
