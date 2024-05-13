package entrega1;

public class EstrategiaDeServicioDeLujo implements EstrategiaDeServicio{
    @Override
    public void ejecutarEstrategia() {
        System.out.println("esta siendo atendido por el restaurante de lujo");
        System.out.println("preparando la comida");
    }
}
