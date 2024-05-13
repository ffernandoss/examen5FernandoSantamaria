package entrega1;

public class EstrategiaDeServicioTematico implements EstrategiaDeServicio{
    @Override
    public void ejecutarEstrategia() {
        System.out.println("esta siendo atendido por el restaurante tematico");
        System.out.println("preparando la comida");
    }
}
