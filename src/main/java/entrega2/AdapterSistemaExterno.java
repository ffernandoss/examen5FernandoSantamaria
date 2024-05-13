package entrega2;


public class AdapterSistemaExterno extends ComponenteRestaurante {
    SistemaExterno sistemaExterno;

    public AdapterSistemaExterno(SistemaExterno sistemaExterno) {
        this.sistemaExterno = sistemaExterno;
    }

    @Override
    public void atender() {
        sistemaExterno.reservar();
        sistemaExterno.entregarComida();
    }
}