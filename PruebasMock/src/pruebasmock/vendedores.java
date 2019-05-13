
package pruebasmock;

import java.util.ArrayList;

/**
 *
 * @author Aaron
 */
public class vendedores {

   protected ArrayList V = new ArrayList();

    /**
     * recorre el array y si el vendedor existe devuelve false y si delvuelve
     * true añade un nuevo vendedor
     *
     * @param v
     * @return
     */
    public boolean anyadir_vendedor(vendedor v) {
        vendedor c;
        for (int i = 0; i < V.size(); i++) {
            c = (vendedor) V.get(i);
            if (v.getNumvend() == c.getNumvend()) {
                return false;
            }
        }
        V.add(v);
        return true;

    }

    /**
     * Recorre el array y si el vendedor existe lo elimina y si no existe
     * devuelve false
     *
     * @param numvend
     * @return
     */
    public boolean eliminar_vendedor(int numvend) {
        vendedor c;
        for (int i = 0; i < V.size(); i++) {
            c = (vendedor) V.get(i);
            if (c.getNumvend() == numvend) {
                V.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * recorremos el array pasandole el numvend y buscamos el numvend, si lo
     * encontramos lo devolcemos y si no devolvemos null
     *
     * @param numvend
     * @return
     */
    public vendedor buscar_vendedor(int numvend) {
        vendedor c;
        for (int i = 0; i < V.size(); i++) {
            c = (vendedor) V.get(i);
            if (c.getNumvend() == numvend) {
                return c;
            }
        }
        return null;
    }

    /**
     * Buscamos un vendedor por provincia y lo devolvemos y si no lo encontramos
     * devolvemos null
     *
     * @param provincia
     * @return
     */
    public ArrayList<vendedor> buscar_vendedor(String provincia) {
        ArrayList v = new ArrayList();
        vendedor c;
        for (int i = 0; i < V.size(); i++) {
            c = (vendedor) V.get(i);
            if (c.getProvincia().equals(provincia)) {
                v.add(c);

            }
        }
        return v;
    }
    /**
     * Cargamos los datos en la base de datos
     * @param provincia 
     */

    public void cargar_datos(String provincia) {
        vendedor v1 = new vendedor(1, "Diego", "Die", "Alicante", "Elche", "Av.Alicante");
        V.add(v1);
        vendedor v2 = new vendedor(2, "Maria", "meri", "Alicante", "Elche", "Av.Ferrocarril");
        V.add(v2);

    }
}
