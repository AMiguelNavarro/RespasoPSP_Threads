package observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Producto extends Observable {

    private String nombre;
    private double precio;
    private int stock;
    private ArrayList<Observer> listaObservers = new ArrayList<>();

    private Observer observer;


    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
        notifyObservers();
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public synchronized void addObserver(Observer observer) {
        this.observer = observer;
        listaObservers.add(observer);
    }


    @Override
    public void notifyObservers() {

        if (listaObservers.isEmpty()){
            return;
        }

        for (Observer observer:listaObservers) {
            observer.update(this, "Stock");
        }

    }
}
