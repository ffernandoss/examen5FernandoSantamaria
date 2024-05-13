package entrega2;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa un grupo de restaurantes. Extiende de la clase ComponenteRestaurante.
 * Implementa el patrón de diseño Composite para manejar grupos de ComponenteRestaurante.
 */
public class GrupoRestaurante extends ComponenteRestaurante {
    List<ComponenteRestaurante> componentes = new ArrayList<>();

    /**
     * Añade un componente a la lista de componentes del grupo de restaurantes.
     * @param componente el componente que se quiere añadir.
     */
    public void addComponente(ComponenteRestaurante componente) {
        componentes.add(componente);
    }

    /**
     * Elimina un componente de la lista de componentes del grupo de restaurantes.
     * @param componente el componente que se quiere eliminar.
     */
    public void removeComponente(ComponenteRestaurante componente) {
        componentes.remove(componente);
    }

    /**
     * Este método sobrescribe el método atender de la clase ComponenteRestaurante.
     * Atiende a todos los componentes del grupo de restaurantes.
     */
    @Override
    public void atender() {
        for (ComponenteRestaurante componente : componentes) {
            componente.atender();
        }
    }
}