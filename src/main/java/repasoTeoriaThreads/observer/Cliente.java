package repasoTeoriaThreads.observer;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(Observable observable, Object arg) {

        if (arg.equals("Stock")){
            System.out.println("Se notifica al cliente " + nombre + " del cambio de stock");
        }

        if (arg.equals("Precio")){
            System.out.println("Se notifica al cliente " + nombre + " del cambio de precio");
        }

    }
}
