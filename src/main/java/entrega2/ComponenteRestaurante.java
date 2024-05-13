package entrega2;

import entrega1.Restaurante;
import java.util.ArrayList;
import java.util.List;

// Composite
public abstract class ComponenteRestaurante implements Restaurante {
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}