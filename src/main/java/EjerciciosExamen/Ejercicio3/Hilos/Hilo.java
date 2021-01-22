package EjerciciosExamen.Ejercicio3.Hilos;

public class Hilo implements Runnable {

    private String nombre;

    public Hilo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("HILO -> " + nombre);
        }

    }
}
