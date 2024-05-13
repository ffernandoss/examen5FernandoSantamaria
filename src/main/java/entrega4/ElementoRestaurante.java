package entrega4;

public class ElementoRestaurante implements ComponenteRestaurante {
    private String nombre;

    public ElementoRestaurante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void agregar(ComponenteRestaurante componente) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void eliminar(ComponenteRestaurante componente) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void mostrar() {
        System.out.println(nombre);
    }
}