package entrega3;

public class Libre implements EstadoMesa {
    @Override
    public void manejar(Mesa mesa) {
        System.out.println("La mesa está libre");
    }
}
