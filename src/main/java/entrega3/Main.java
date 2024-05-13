package entrega3;

public class Main {
    public static void main(String[] args) {

        Mediator mediator = new RestauranteMediator();


        Componente cocina = new Cocina(mediator);
        Componente servicioAlCliente = new ServicioAlCliente(mediator);
        Componente entrega = new Entrega(mediator);


        mediator.addComponente(cocina);
        mediator.addComponente(servicioAlCliente);
        mediator.addComponente(entrega);


        Command reservarCommand = new ReservarCommand();
        Command ordenarCommand = new OrdenarCommand();
        Command cancelarCommand = new CancelarCommand();


        reservarCommand.execute();
        ordenarCommand.execute();
        cancelarCommand.execute();


        Mesa mesa = new Mesa();
        mesa.setEstado(new Libre());
        mesa.manejarEstado();

        mesa.setEstado(new Reservada());
        mesa.manejarEstado();

        mesa.setEstado(new Ocupada());
        mesa.manejarEstado();
    }
}