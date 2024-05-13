package entrega4;

public class ModeloRestaurante {
    private Restaurante restaurante;

    public ModeloRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public void agregarComponente(ComponenteRestaurante componente) {
        restaurante.agregar(componente);
    }

    public void eliminarComponente(ComponenteRestaurante componente) {
        restaurante.eliminar(componente);
    }

    public String mostrarRestaurante() {

        return restaurante.getNombre();
    }
}