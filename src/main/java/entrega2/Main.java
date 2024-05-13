package entrega2;

public class Main {
    public static void main(String[] args) {

        SistemaExterno sistemaExterno = new SistemaExternoImpl();

        AdapterSistemaExterno adapter = new AdapterSistemaExterno(sistemaExterno);

        GrupoRestaurante grupo = new GrupoRestaurante();
        grupo.addComponente(adapter);


        Observer observer = new ObserverImpl();
        grupo.addObserver(observer);

       grupo.atender();
    }
}