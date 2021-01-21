package Ejercicio5.Task;

import javafx.concurrent.Task;

public class CronometroTask extends Task<Void> {

    private int numero;
    private boolean pausado = false;

    public CronometroTask(int numero) {
        this.numero = numero;
    }

    @Override
    protected Void call() throws Exception {

        int porcentaje;
        int progreso;

        updateMessage("Calculando ...");

        for (int i = 1; i <= numero; i++) {

            while (pausado) {
                Thread.sleep(1000);
            }

            progreso = i;
            porcentaje = progreso * 100 / numero;

            Thread.sleep(1000);
            updateProgress(i,numero);
            updateMessage(i + " de " + numero + " segundos (" + porcentaje + " %)");
        }

        return null;
    }


    public void setPausado(boolean pausado) {
        this.pausado = pausado;
    }
}
