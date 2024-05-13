package entrega2;

import entrega1.Restaurante;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase abstracta representa un componente de restaurante que puede ser un restaurante individual o un grupo de restaurantes.
 * Implementa la interfaz Restaurante y el patrón de diseño Observer para notificar cambios a los observadores.
 */
public abstract class ComponenteRestaurante implements Restaurante {
    List<Observer> observers = new ArrayList<>();

    /**
     * Añade un observador a la lista de observadores.
     * @param observer el observador que se quiere añadir.
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Elimina un observador de la lista de observadores.
     * @param observer el observador que se quiere eliminar.
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifica a todos los observadores de cualquier cambio.
     * Cada observador ejecutará su método update.
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}