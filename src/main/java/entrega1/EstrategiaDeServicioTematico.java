package entrega1;

/**
 * Esta clase implementa la interfaz EstrategiaDeServicio y define la estrategia de servicio para un restaurante temático.
 */
public class EstrategiaDeServicioTematico implements EstrategiaDeServicio{

    /**
     * Este método sobrescribe el método ejecutarEstrategia de la interfaz EstrategiaDeServicio.
     * Imprime mensajes en la consola para simular la atención al cliente en un restaurante temático.
     */
    @Override
    public void ejecutarEstrategia() {
        System.out.println("esta siendo atendido por el restaurante tematico");
        System.out.println("preparando la comida");
    }
}