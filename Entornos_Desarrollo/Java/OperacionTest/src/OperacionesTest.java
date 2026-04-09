import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class OperacionesTest {

    private Operaciones operaciones;

    @Before
    // Se mete los dos parametros da igual los dos numeros como si son 1000 y 2000 PERO numeros
    public void setUp() {
        operaciones = new Operaciones(0,0);
    }

    @Test
    public void suma() {
        int resultado = operaciones.suma(3, 5);
        assertEquals(8, resultado);
    }

    @Test
    public void resta() {
        int resultado = operaciones.resta(5, 3);
        assertEquals(3, resultado);
    }

    @Test
    public void multi() {
        int resultado = operaciones.multi(4, 3);
        assertEquals(13, resultado);
    }

    @Test
    public void division() {
        int resultado = operaciones.division(4, 2);
        assertEquals(2, resultado);
    }
}
