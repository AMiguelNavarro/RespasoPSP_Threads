package Utilidades;

public class R {

    public static void bucleHilo(String texto, double segundos) {

        double time = segundos * 1000;

        for (int i = 0; i < 10; i++) {

            System.out.println(texto);

            if (time != 0) {
                try {
                    Thread.sleep((long) time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }

    }

}
