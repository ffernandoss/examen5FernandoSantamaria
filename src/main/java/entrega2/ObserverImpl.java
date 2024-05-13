package entrega2;

/**
 * Esta clase implementa la interfaz Observer.
 * Define cómo se maneja la notificación de cambios en el restaurante.
 */
public class ObserverImpl implements Observer {
    /**
     * Este método se llama cuando se notifica un cambio en el restaurante.
     * Imprime un mensaje en la consola indicando que se ha notificado un cambio.
     */
    @Override
    public void update() {
        System.out.println("Se ha notificado un cambio en el restaurante");
    }
}