package entrega4;

public class ControladorRestaurante {
    private ModeloRestaurante modelo;
    private VistaRestaurante vista;

    public ControladorRestaurante(ModeloRestaurante modelo, VistaRestaurante vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void agregarComponente(ComponenteRestaurante componente) {
        modelo.agregarComponente(componente);
        actualizarVista();
    }

    public void eliminarComponente(ComponenteRestaurante componente) {
        modelo.eliminarComponente(componente);
        actualizarVista();
    }

    private void actualizarVista() {
        vista.mostrarRestaurante(modelo.mostrarRestaurante());
    }
}