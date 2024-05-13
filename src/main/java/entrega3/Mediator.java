package entrega3;

public interface Mediator {
    void addComponente(Componente componente);
    void comunicar(String mensaje, Componente componente);
}
