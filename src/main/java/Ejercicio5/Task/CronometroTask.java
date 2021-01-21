package Ejercicio5.Task;

import javafx.concurrent.Task;

public class CronometroTask extends Task<Void> {

    private int numero;

    public CronometroTask(int numero) {
        this.numero = numero;
    }

    @Override
    protected Void call() throws Exception {

        int porcentaje;
        int progreso;

        updateMessage("Calculando ...");

        for (int i = 1; i <= numero; i++) {

            progreso = i;
            porcentaje = progreso * 100 / numero;

            Thread.sleep(1000);
            updateProgress(i,numero);
            updateMessage(i + " de " + numero + " segundos (" + porcentaje + " %)");
        }

        return null;
    }
}
