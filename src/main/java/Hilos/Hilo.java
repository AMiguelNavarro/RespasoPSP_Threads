package Hilos;

import Utilidades.R;

public class Hilo extends Thread{

    private String texto;

    public Hilo(String texto){
        this.texto = texto;
    }

    @Override
    public void run() {
        R.bucleHilo(texto, 0.5);
    }
}
