package pruebasmock;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


/**
 *
 * @author Aaron
 */
@RunWith(Parameterized.class)
public class ParametizadaEliminar {

    protected ArrayList vendedores = new ArrayList();
    public vendedores v = new vendedores();

    @Parameterized.Parameters
    /**
     * Le decimos el numero de vendedor y si lo va a añadir o no 
     */
    public static Iterable data() {
        return Arrays.asList(new Object[][]{{1, true}, {2, true}, {3, true}, {4, true}, {5, true}, {6, true}, {7, false}});
    }

    /**
     * Introducimos todos los vendedores para hacer las pruebas
     */
    public void setUp() {
        vendedor v1 = new vendedor(1, "Manuel", "Manu", "Alicante", "Alicante", "AV.Elche");
        vendedor v2 = new vendedor(2, "Diego", "Diego", "Alicante", "Alicane", "Rotonda");
        vendedor v3 = new vendedor(3, "Agustin", "Agu", "Alicante", "Alicante", "Cortes");
        vendedor v4 = new vendedor(4, "Sergio", "Ser", "Valencia", "Valencia", "Oceanografic");
        vendedor v5 = new vendedor(5, "Critina", "cris", "Valencia", "Valencia", "AV.centro");
        vendedor v6 = new vendedor(6, "Elena", "El", "Catalunya", "Barcelona", "AV.de Barcelona");
        vendedores.add(v1);
        vendedores.add(v2);
        vendedores.add(v3);
        vendedores.add(v4);
        vendedores.add(v5);
        vendedores.add(v6);
    }

    private int pasado;
    private boolean esperado;

    public ParametizadaEliminar(int pasado, boolean esperado) {
        this.pasado = pasado;
        this.esperado = esperado;
    }

    @Test
    public void test_Elimina() {

        boolean result = v.eliminar_vendedor(pasado);
        Assert.assertEquals(result, esperado);
    }
}