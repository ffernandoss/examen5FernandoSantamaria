package entrega3;

public class ServicioAlCliente extends Componente {
    public ServicioAlCliente(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("mensaje redibido: "+mensaje);
    }
}
