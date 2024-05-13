package entrega3;

public class Ocupada implements EstadoMesa {
    @Override
    public void manejar(Mesa mesa) {
        System.out.println("La mesa está ocupada");
    }
}