import entrega2.ComponenteRestaurante;

import java.util.ArrayList;
import java.util.List;

public class GrupoRestaurante extends ComponenteRestaurante {
    List<ComponenteRestaurante> componentes = new ArrayList<>();

    public void addComponente(ComponenteRestaurante componente) {
        componentes.add(componente);
    }

    public void removeComponente(ComponenteRestaurante componente) {
        componentes.remove(componente);
    }

    @Override
    public void atender() {
        for (ComponenteRestaurante componente : componentes) {
            componente.atender();
        }
    }
}

