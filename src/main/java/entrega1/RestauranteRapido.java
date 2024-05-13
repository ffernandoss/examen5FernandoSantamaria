package entrega1;

/**
 * Esta clase implementa la interfaz Restaurante y define el comportamiento de un restaurante rápido.
 */
public class RestauranteRapido implements Restaurante {

    /**
     * Este método sobrescribe el método atender de la interfaz Restaurante.
     * Imprime un mensaje en la consola para simular la atención al cliente en un restaurante rápido.
     */
    @Override
    public void atender() {
        System.out.println("esta siendo atendido por el restaurante rapido");
    }
}