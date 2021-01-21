package Ejercicio4.Task;

import javafx.concurrent.Task;

public class CuentaAtrasTask extends Task<Integer> {

    private int numero;

    public CuentaAtrasTask(int numero) {
        this.numero = numero;
    }

    @Override
    protected Integer call() throws Exception {

        updateMessage("Calculando ...");

        int num = numero;

        for(int i = num; i >= 0; i-- ) {
            Thread.sleep(1000);
            updateMessage(String.valueOf(i));
        }

        updateMessage("Finalizado");

        return null;
    }
}
