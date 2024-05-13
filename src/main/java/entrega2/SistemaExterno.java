package entrega2;

/**
 * Esta interfaz representa un sistema externo con el que el restaurante interactúa.
 * Define dos operaciones principales: reservar y entregar comida.
 */
public interface SistemaExterno {
    /**
     * Este método representa la operación de reserva en el sistema externo.
     */
    void reservar();

    /**
     * Este método representa la operación de entrega de comida en el sistema externo.
     */
    void entregarComida();
}