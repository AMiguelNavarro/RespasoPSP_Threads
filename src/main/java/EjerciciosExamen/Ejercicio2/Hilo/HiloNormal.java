package EjerciciosExamen.Ejercicio2.Hilo;

public class HiloNormal extends Thread{

    private String nombre;

    public HiloNormal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Ejecutando el hilo principal, nombre -> " + nombre);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
