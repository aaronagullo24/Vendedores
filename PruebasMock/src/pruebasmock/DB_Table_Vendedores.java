
package pruebasmock;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Aaron
 */
public class DB_Table_Vendedores {

    protected String conexion;
    protected ArrayList vendedores = new ArrayList();

    /**
     * Devulve la conexion con la base de datos
     *
     * @param conexion
     */
    public DB_Table_Vendedores(String conexion) {
        this.conexion = conexion;
    }

    /**
     * Devuelve si el vendedor se añadio correctamente
     *
     * @param v
     * @return
     */
    public boolean anyadir_Vendedor(vendedor v) {
        boolean anyadido = true;
        return anyadido;
    }

    /**
     * Devuvle si el vendedor se modifico correctamente
     *
     * @param num_vend
     * @param modificar
     * @return
     */
    public boolean modificar_Vendedor(int num_vend, Array modificar) {
        boolean mod = true;
        return mod;
    }

    /**
     * Devuelve si el vendedor se borro correctamente
     *
     * @param num_vend
     * @return
     */
    public boolean borrar_Vendedor(int num_vend) {
        boolean borrar = true;
        return borrar;
    }

    /**
     * Arra List de los vendedores
     *
     * @param provincia
     * @return
     */
    public ArrayList buscar_Vendedor(String provincia) {
        return vendedores;
    }

    public void desconectar() {

    }
}
