package entrega2;

/**
 * Esta es la clase principal del programa.
 * Crea una instancia de SistemaExterno, un adaptador para el sistema externo, un grupo de restaurantes y un observador.
 * Añade el adaptador y el observador al grupo de restaurantes y luego atiende al grupo.
 */
public class Main {
    /**
     * El punto de entrada principal del programa.
     * @param args los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        /**
         * Crea una nueva instancia de SistemaExternoImpl, que implementa la interfaz SistemaExterno.
         */
        SistemaExterno sistemaExterno = new SistemaExternoImpl();

        /**
         * Crea un nuevo adaptador para el sistema externo.
         */
        AdapterSistemaExterno adapter = new AdapterSistemaExterno(sistemaExterno);

        /**
         * Crea un nuevo grupo de restaurantes.
         */
        GrupoRestaurante grupo = new GrupoRestaurante();
        /**
         * Añade el adaptador al grupo de restaurantes.
         */
        grupo.addComponente(adapter);

        /**
         * Crea un nuevo observador.
         */
        Observer observer = new ObserverImpl();
        /**
         * Añade el observador al grupo de restaurantes.
         */
        grupo.addObserver(observer);

        /**
         * Atiende al grupo de restaurantes.
         */
        grupo.atender();
    }
}