package entrega2;

public class SistemaExternoImpl implements SistemaExterno {
    @Override
    public void reservar() {
        System.out.println("Reserva realizada en el sistema externo");
    }

    @Override
    public void entregarComida() {
        System.out.println("Comida entregada a través del sistema externo");
    }
}