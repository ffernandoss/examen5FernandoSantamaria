package entrega1;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase es un gestor de restaurantes. Utiliza el patrón de diseño Singleton para asegurar que solo exista una instancia de esta clase.
 */
public class GestorDeRestaurante {
    // Instancia única de la clase
    private static GestorDeRestaurante instancia;
    // Lista de restaurantes gestionados
    private List<Restaurante> restaurantes;

    /**
     * Constructor privado para evitar la creación de múltiples instancias.
     */
    private GestorDeRestaurante() {
        this.restaurantes = new ArrayList<>();
    }

    /**
     * Método para obtener la instancia única de la clase.
     * @return La instancia única de GestorDeRestaurante.
     */
    public static GestorDeRestaurante getInstancia() {
        if (instancia == null) {
            instancia = new GestorDeRestaurante();
        }
        return instancia;
    }

    /**
     * Método para añadir un restaurante a la lista de restaurantes gestionados.
     * @param restaurante El restaurante a añadir.
     */
    public void addRestaurante(Restaurante restaurante) {
        this.restaurantes.add(restaurante);
    }

    /**
     * Método para eliminar un restaurante de la lista de restaurantes gestionados.
     * @param restaurante El restaurante a eliminar.
     */
    public void deleteRestaurante(Restaurante restaurante) {
        this.restaurantes.remove(restaurante);
    }

    /**
     * Método para atender a los clientes de todos los restaurantes gestionados.
     */
    public void getRestaurante() {
        for (Restaurante restaurante : this.restaurantes) {
            restaurante.atender();
        }
    }
}