package entrega2;

/**
 * Esta interfaz representa un observador en el patrón de diseño Observer.
 * Los observadores son notificados de los cambios en el sujeto al que están observando.
 */
public interface Observer {
    /**
     * Este método se llama cuando el sujeto al que el observador está observando cambia.
     */
    void update();
}