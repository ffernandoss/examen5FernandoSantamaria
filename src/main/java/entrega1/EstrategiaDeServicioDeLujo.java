package entrega1;

/**
 * Esta clase implementa la interfaz EstrategiaDeServicio y define la estrategia de servicio para un restaurante de lujo.
 */
public class EstrategiaDeServicioDeLujo implements EstrategiaDeServicio{

    /**
     * Este método sobrescribe el método ejecutarEstrategia de la interfaz EstrategiaDeServicio.
     * Imprime mensajes en la consola para simular la atención al cliente en un restaurante de lujo.
     */
    @Override
    public void ejecutarEstrategia() {
        System.out.println("esta siendo atendido por el restaurante de lujo");
        System.out.println("preparando la comida");
    }
}