package entrega1;
import java.util.ArrayList;
import java.util.List;

public class GestorDeRestaurante {
    private static GestorDeRestaurante instancia;
    private List<Restaurante> restaurantes;

    private GestorDeRestaurante() {
        this.restaurantes = new ArrayList<>();
    }

    public static GestorDeRestaurante getInstancia() {
        if (instancia == null) {
            instancia = new GestorDeRestaurante();
        }
        return instancia;
    }

    public void addRestaurante(Restaurante restaurante) {
        this.restaurantes.add(restaurante);
    }

    public void deleteRestaurante(Restaurante restaurante) {
        this.restaurantes.remove(restaurante);
    }
    public void getRestaurante() {
        for (Restaurante restaurante : this.restaurantes) {
            restaurante.atender();
        }
    }
}