package entrega1;

public class GestorDeRestaurante {
    private static GestorDeRestaurante instancia;

    private GestorDeRestaurante() {

    }

    public static GestorDeRestaurante getInstancia() {
        if (instancia == null) {
            instancia = new GestorDeRestaurante();
        }
        return instancia;
    }

    // Métodos de gestión de restaurantes
}