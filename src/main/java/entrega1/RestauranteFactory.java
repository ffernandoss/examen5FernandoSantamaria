package entrega1;

/**
 * Esta clase es una fábrica de restaurantes. Utiliza el patrón de diseño Factory para crear diferentes tipos de restaurantes.
 */
public class RestauranteFactory {

    /**
     * Este método crea un restaurante de un tipo específico.
     * @param tipo El tipo de restaurante a crear. Puede ser "rapido", "tematico" o "lujo".
     * @return Un objeto de tipo Restaurante que representa el restaurante creado.
     * @throws IllegalArgumentException si el tipo de restaurante no es soportado.
     */
    public Restaurante crearRestaurante(String tipo) {
        switch (tipo) {
            case "rapido":
                return new RestauranteRapido();
            case "tematico":
                return new RestauranteTematico();
            case "lujo":
                return new RestauranteDeLujo();
            default:
                throw new IllegalArgumentException("Tipo de restaurante no soportado");
        }
    }
}