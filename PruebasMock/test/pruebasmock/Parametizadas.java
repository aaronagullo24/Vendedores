/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasmock;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Aaron
 */
@RunWith(Parameterized.class)
public class Parametizadas {

    @Parameters

    public static Iterable data() {
        return Arrays.asList(new Object[][]{{1, "Diego", "Die", "Alicante", "Elche", "Av.Alicante"}});
    }

    public int numvend;
    public String nomvend;
    public String nombrecomer;
    public String provincia;
    public String localidad;
    public String direccion;

    public Parametizadas(int numvend, String nomvend, String nombrecomer, String provincia, String localidad, String direccion) {
        this.numvend = numvend;
        this.nomvend = nomvend;
        this.nombrecomer = nombrecomer;
        this.provincia = provincia;
        this.localidad = localidad;
        this.direccion = direccion;

    }

    @Test

    public void Eliminar_vendedor() {

    }

    public void Buscar_Vendedor() {

    }

}
