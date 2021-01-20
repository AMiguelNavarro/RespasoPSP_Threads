package repasoTeoriaThreads.observer;

public class Principal {
    public static void main(String[] args) {

        Producto producto = new Producto("Agua", 2.5, 5);

        Cliente cliente1 = new Cliente("Alberto");
        Cliente cliente2 = new Cliente("Juan");
        Cliente cliente3 = new Cliente("Oscar");
        Cliente cliente4 = new Cliente("Eva");
        Cliente cliente5 = new Cliente("Laura");

        producto.addObserver(cliente1);
        producto.addObserver(cliente2);
        producto.addObserver(cliente3);
        producto.addObserver(cliente4);
        producto.addObserver(cliente5);

//        producto.setStock(10);
        producto.setPrecio(5);

    }

}
