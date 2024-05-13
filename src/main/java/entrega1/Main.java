package entrega1;

/**
 * Clase principal de la aplicación.
 */
public class Main {
    /**
     * Método principal de la aplicación.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Crear una fábrica de restaurantes
        RestauranteFactory restauranteFactory = new RestauranteFactory();

        // Crear diferentes tipos de restaurantes
        Restaurante restauranteRapido = restauranteFactory.crearRestaurante("rapido");
        Restaurante restauranteTematico = restauranteFactory.crearRestaurante("tematico");
        Restaurante restauranteDeLujo = restauranteFactory.crearRestaurante("lujo");

        // Obtener la instancia del gestor de restaurantes
        GestorDeRestaurante gestor = GestorDeRestaurante.getInstancia();

        // Añadir los restaurantes al gestor
        gestor.addRestaurante(restauranteRapido);
        gestor.addRestaurante(restauranteTematico);
        gestor.addRestaurante(restauranteDeLujo);

        // Ejecutar las estrategias de servicio de cada restaurante
        restauranteRapido.atender();
        restauranteTematico.atender();
        restauranteDeLujo.atender();
    }
}