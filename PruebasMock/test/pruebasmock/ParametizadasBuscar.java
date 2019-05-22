package pruebasmock;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Aaron
 */
@RunWith(Parameterized.class)
public class ParametizadasBuscar {

    public vendedores todos;
    static vendedores VendedoresAlicante;
    String provincia;

    @Parameterized.Parameters

    /**
     * Creamos el array para ver que vendedores son de alicante
     */
    public static Iterable data() {
        return Arrays.asList(new Object[][]{{"Alicante", VendedoresAlicante}});
    }

    public int numvend;

    public ParametizadasBuscar(String provincia, ArrayList<vendedor> Vendedores) {
        this.provincia = provincia;
    }

    @Test
    public void Buscar_Vendedor() {
        vendedores esperado = todos.buscar_vendedor(provincia);
        Assert.assertEquals(VendedoresAlicante, esperado);
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    /**
     * introducimos los datos y le decimos cuales son de alicante
     */
    public void setUp() {
        vendedor v1 = new vendedor(1, "Manuel", "Manu", "Alicante", "Alicante", "AV.Elche");
        vendedor v2 = new vendedor(2, "Diego", "Diego", "Alicante", "Alicane", "Rotonda");
        vendedor v3 = new vendedor(3, "Agustin", "Agu", "Alicante", "Alicante", "Cortes");
        vendedor v4 = new vendedor(4, "Sergio", "Ser", "Valencia", "Valencia", "Oceanografic");
        vendedor v5 = new vendedor(5, "Critina", "cris", "Valencia", "Valencia", "AV.centro");
        vendedor v6 = new vendedor(6, "Elena", "El", "Catalunya", "Barcelona", "AV.de Barcelona");
        todos = new vendedores();
        todos.anyadir_vendedor(v1);
        todos.anyadir_vendedor(v2);
        todos.anyadir_vendedor(v3);
        todos.anyadir_vendedor(v4);
        todos.anyadir_vendedor(v5);
        todos.anyadir_vendedor(v6);
        VendedoresAlicante = new vendedores();
        VendedoresAlicante.anyadir_vendedor(v1);
        VendedoresAlicante.anyadir_vendedor(v2);
        VendedoresAlicante.anyadir_vendedor(v3);
    }

    @After
    public void tearDown() {
    }
}
