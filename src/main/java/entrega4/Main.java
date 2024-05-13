package entrega4;

public class Main {
    public static void main(String[] args) {

        Restaurante restaurante1 = new Restaurante("Restaurante 1");
        Restaurante restaurante2 = new Restaurante("Restaurante 2");
        ComponenteRestaurante elemento1 = new ElementoRestaurante("Elemento 1");
        ComponenteRestaurante elemento2 = new ElementoRestaurante("Elemento 2");


        restaurante1.agregar(elemento1);
        restaurante2.agregar(elemento2);


        ModeloRestaurante modelo = new ModeloRestaurante(restaurante1);


        VistaRestaurante vista = new VistaRestaurante();


        ControladorRestaurante controlador = new ControladorRestaurante(modelo, vista);

        controlador.agregarComponente(restaurante2);
    }
}