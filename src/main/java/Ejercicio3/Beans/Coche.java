package Ejercicio3.Beans;

import javafx.scene.control.ProgressBar;

public class Coche {

    private String nombre;
    private int velocidad;
    private int distanciaRecorrida;

    public Coche(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        distanciaRecorrida = 0;
    }

    public Coche() {}

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }
    public void setDistanciaRecorrida(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

}
