package entrega1;

/**
 * Esta clase implementa la interfaz Restaurante y define el comportamiento de un restaurante temático.
 */
public class RestauranteTematico implements Restaurante {

    /**
     * Este método sobrescribe el método atender de la interfaz Restaurante.
     * Imprime un mensaje en la consola para simular la atención al cliente en un restaurante temático.
     */
    @Override
    public void atender() {
        System.out.println("esta siendo atendido por el restaurante tematico");
    }
}