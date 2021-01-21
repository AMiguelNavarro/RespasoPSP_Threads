package Ejercicio3.Hilo;

import Ejercicio3.Beans.Coche;
import javafx.concurrent.Task;

public class CarreraTask extends Task<Void> {

    private int distancia;
    private Coche coche;


    public CarreraTask(Coche coche, int distancia) {
        this.coche = coche;
        this.distancia = distancia;
    }

    @Override
    protected Void call() throws Exception {
        return null;
    }
}
