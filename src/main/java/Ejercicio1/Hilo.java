package Ejercicio1;

public class Hilo extends Thread{

    private double segundosDormido;
    private int numEjecuciones;
    private int contador;

    public Hilo(int contador, double segundosDormido, int numEjecuciones) {
        this.contador = contador;
        this.segundosDormido = segundosDormido * 1000;
        this.numEjecuciones = numEjecuciones;
    }

    @Override
    public void run() {

        for (int i = 0; i < numEjecuciones; i++) {

            System.out.println(contador);

            try {
                Thread.sleep((long) segundosDormido);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            contador++;

        }

    }
}
