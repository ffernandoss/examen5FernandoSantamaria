package entrega2;

/**
 * Esta clase implementa la interfaz SistemaExterno.
 * Define cómo se manejan las operaciones de reserva y entrega de comida en el sistema externo.
 */
public class SistemaExternoImpl implements SistemaExterno {
    /**
     * Este método se llama para realizar una reserva en el sistema externo.
     * Imprime un mensaje en la consola indicando que la reserva ha sido realizada.
     */
    @Override
    public void reservar() {
        System.out.println("Reserva realizada en el sistema externo");
    }

    /**
     * Este método se llama para entregar comida a través del sistema externo.
     * Imprime un mensaje en la consola indicando que la comida ha sido entregada.
     */
    @Override
    public void entregarComida() {
        System.out.println("Comida entregada a través del sistema externo");
    }
}