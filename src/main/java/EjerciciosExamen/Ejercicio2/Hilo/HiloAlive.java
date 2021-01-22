package EjerciciosExamen.Ejercicio2.Hilo;

public class HiloAlive extends Thread{

    private HiloNormal hiloPrincipal;

    public HiloAlive(HiloNormal hiloPrincipal) {
        this.hiloPrincipal = hiloPrincipal;
    }

    @Override
    public void run() {

        while (hiloPrincipal.isAlive()) {
            System.out.println("I'M ALIVE!! mientras que el hilo principal -> " + hiloPrincipal.getNombre() + " siga activo");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("HILOS FINALIZADOS");

    }
}
