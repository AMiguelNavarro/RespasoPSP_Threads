package EjerciciosExamen.Ejercicio1.Hilo;

import javafx.concurrent.Task;

public class HiloTask extends Task<Void> {

    private int tiempo;

    public HiloTask(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    protected Void call() throws Exception {

        double progreso = -1;

        updateMessage("Calculando ...");

        for (int i = tiempo; i >= 0; i--) {

            if (isCancelled()){
                break;
            }

            Thread.sleep(1000);
            updateMessage("Quedan " + i + " segundos");

            progreso++;
            updateProgress(progreso,tiempo);
        }

        return null;
    }

}
