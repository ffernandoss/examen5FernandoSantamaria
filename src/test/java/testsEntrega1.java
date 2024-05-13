

import entrega4.ComponenteRestaurante;
import entrega4.ElementoRestaurante;
import entrega4.ModeloRestaurante;
import entrega4.Restaurante;
import org.junit.Test;
import static org.junit.Assert.*;

public class testsEntrega1 {
    @Test
    public void testGetNombre() {
        Restaurante restaurante = new Restaurante("Restaurante 1");
        assertEquals("Restaurante 1", restaurante.getNombre());
    }

    @Test
    public void testAgregarComponente() {
        Restaurante restaurante = new Restaurante("Restaurante 1");
        ModeloRestaurante modelo = new ModeloRestaurante(restaurante);
        ComponenteRestaurante elemento = new ElementoRestaurante("Restaurante 1");
        modelo.agregarComponente(elemento);
        assertEquals("Restaurante 1", restaurante.getNombre());

    }

    @Test
    public void testEliminarComponente() {
        Restaurante restaurante = new Restaurante("Restaurante 1");
        ModeloRestaurante modelo = new ModeloRestaurante(restaurante);
        ComponenteRestaurante elemento = new ElementoRestaurante("Elemento 1");
        modelo.agregarComponente(elemento);
        modelo.eliminarComponente(elemento);
        assertEquals("Restaurante 1", restaurante.getNombre());

    }

}