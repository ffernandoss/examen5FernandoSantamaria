package entrega1;

public class RestauranteRapido implements Restaurante {
    @Override
    public void atender() {
        System.out.println("esta siendo atendido por el restaurante rapido");
    }
}