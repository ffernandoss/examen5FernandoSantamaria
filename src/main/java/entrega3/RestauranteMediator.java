package entrega3;

public class RestauranteMediator implements Mediator{
    @Override
    public void addComponente(Componente componente){
        System.out.println("Componente agregado");
    }

    public void comunicar(String mensaje, Componente componente){
        System.out.println("Mensaje: " + mensaje + " Componente: " + componente);
    }
}
