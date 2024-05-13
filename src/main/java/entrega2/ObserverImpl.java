package entrega2;

public class ObserverImpl implements Observer {
    @Override
    public void update() {
        System.out.println("Se ha notificado un cambio en el restaurante");
    }
}