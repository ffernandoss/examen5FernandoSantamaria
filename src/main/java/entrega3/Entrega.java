package entrega3;

public class Entrega extends Componente {
    public Entrega(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Entrega recibe: " + mensaje);
    }
}

