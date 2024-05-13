package entrega4;

import java.util.ArrayList;
import java.util.List;

public class Restaurante implements ComponenteRestaurante {
    private List<ComponenteRestaurante> componentes = new ArrayList<>();
    private String nombre;

    public Restaurante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void agregar(ComponenteRestaurante componente) {
        componentes.add(componente);
    }

    @Override
    public void eliminar(ComponenteRestaurante componente) {
        componentes.remove(componente);
    }

    @Override
    public void mostrar() {
        System.out.println("Restaurante: " + nombre);
        for (ComponenteRestaurante componente : componentes) {
            componente.mostrar();
        }
    }
}