
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
        vendedores instance = new vendedores();
        instance.cargar_datos("Alicante");
        vendedor vend=new vendedor(8, "Diego", "Die", "Alicante", "Elche", "Av.Alicante");
        boolean expResult = true;
        boolean result = instance.anyadir_vendedor(vend);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public boolean equals(vendedor v1,vendedor v2){
        if(v1.getNumvend()==v2.getNumvend()){
            return true;
        }return false;
    }

    /**
     * Test of buscar_vendedor method, of class vendedores.
     */
    @Test
    public void testBuscar_vendedor_int() {
        System.out.println("buscar_vendedor");
        int numvend = 4;
        vendedores instance = new vendedores();
        instance.cargar_datos("Alicante");
        vendedor expResult = new vendedor(4, "Diego", "Die", "Alicante", "Elche", "Av.Alicante");
        vendedor result = instance.buscar_vendedor(numvend);
        equals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
   
    
}
