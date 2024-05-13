package entrega2;

/**
 * Esta clase es un adaptador que permite la interacción entre el sistema de restaurante y un sistema externo.
 * Extiende de la clase ComponenteRestaurante e implementa su método atender.
 */
public class AdapterSistemaExterno extends ComponenteRestaurante {
    SistemaExterno sistemaExterno;

    /**
     * Constructor de la clase AdapterSistemaExterno.
     * @param sistemaExterno una instancia del sistema externo con el que se quiere interactuar.
     */
    public AdapterSistemaExterno(SistemaExterno sistemaExterno) {
        this.sistemaExterno = sistemaExterno;
    }

    /**
     * Este método sobrescribe el método atender de la clase ComponenteRestaurante.
     * Realiza una reserva y entrega comida a través del sistema externo.
     */
    @Override
    public void atender() {
        sistemaExterno.reservar();
        sistemaExterno.entregarComida();
    }
}