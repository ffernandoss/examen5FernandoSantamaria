package entrega3;

import java.util.ArrayList;
import java.util.List;

public class RestauranteMediator implements Mediator{
    private List<Componente> componentes;

    public RestauranteMediator() {
        this.componentes = new ArrayList<>();
    }

    @Override
    public void addComponente(Componente componente){
        componentes.add(componente);
        System.out.println("Componente agregado");
    }

    public void comunicar(String mensaje, Componente componente){
        System.out.println("Mensaje: " + mensaje + " Componente: " + componente);
    }
}