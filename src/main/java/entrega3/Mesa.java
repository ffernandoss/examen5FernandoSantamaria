package entrega3;

public class Mesa {
    private EstadoMesa estado;

    public void setEstado(EstadoMesa estado) {
        this.estado = estado;
    }

    public void manejarEstado() {
        estado.manejar(this);
    }
}
