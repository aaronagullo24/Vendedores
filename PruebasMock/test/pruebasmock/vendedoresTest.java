
package pruebasmock;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aaron
 */
public class vendedoresTest {
    
    public vendedoresTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of anyadir_vendedor method, of class vendedores.
     */
    @Test
    public void testAnyadir_vendedor() {
        System.out.println("anyadir_vendedor");
        vendedor v = null;
        vendedores instance = new vendedores();
        instance.cargar_datos("Alicante");
        vendedor vend=new vendedor(1, "Diego", "Die", "Alicante", "Elche", "Av.Alicante");
        boolean expResult = false;
        boolean result = instance.anyadir_vendedor(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar_vendedor method, of class vendedores.
     */
    @Test
    public void testEliminar_vendedor() {
        System.out.println("eliminar_vendedor");
        int numvend = 0;
        vendedores instance = new vendedores();
        boolean expResult = false;
        boolean result = instance.eliminar_vendedor(numvend);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscar_vendedor method, of class vendedores.
     */
    @Test
    public void testBuscar_vendedor_int() {
        System.out.println("buscar_vendedor");
        int numvend = 0;
        vendedores instance = new vendedores();
        instance.cargar_datos("alicante");
        vendedor expResult = new vendedor(1, "Diego", "Die", "Alicante", "Elche", "Av.Alicante");
        vendedor result = instance.buscar_vendedor(numvend);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscar_vendedor method, of class vendedores.
     */
    @Test
    public void testBuscar_vendedor_String() {
        System.out.println("buscar_vendedor");
        String provincia = "";
        vendedores instance = new vendedores();
        vendedor expResult = null;
        ArrayList<vendedor> result = instance.buscar_vendedor(provincia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cargar_datos method, of class vendedores.
     */
    @Test
    public void testCargar_datos() {
        System.out.println("cargar_datos");
        String provincia = "";
        vendedores instance = new vendedores();
        instance.cargar_datos(provincia);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
