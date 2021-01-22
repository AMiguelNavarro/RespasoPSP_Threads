package Ejercicio3.Hilo;

import Ejercicio3.Beans.Coche;
import Ejercicio3.Controlador.InicioControlador;
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

        double progreso;

        for (int i = coche.getDistanciaRecorrida(); i <= distancia; i += coche.getVelocidad()) {

            if (isCancelled()){
                break;
            }

            Thread.sleep(500);
            updateMessage("Llevas " + i + " de " + distancia);

            progreso = i;
            updateProgress(i, distancia);

        }

        return null;
    }
}
