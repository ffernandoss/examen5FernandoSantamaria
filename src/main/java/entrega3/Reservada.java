package entrega3;

public class Reservada implements EstadoMesa {
    @Override
    public void manejar(Mesa mesa) {
        System.out.println("La mesa está reservada");
    }
}
