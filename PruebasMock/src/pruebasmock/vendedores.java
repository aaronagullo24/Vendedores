package pruebasmock;

import java.util.ArrayList;
import java.util.Objects;

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
    public vendedores buscar_vendedor(String provincia) {
        vendedores ven = new vendedores();
        vendedor v;
        int c = 0;
        for (int i = 0; i < V.size(); i++) {
            v = (vendedor) V.get(i);
            if (v.getProvincia().equals(provincia)) {
                ven.anyadir_vendedor(v);
            }
        }
        return ven;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.V);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final vendedores other = (vendedores) obj;
        if (!Objects.equals(this.V, other.V)) {
            return false;
        }
        return true;
    }

    /**
     * Cargamos los datos en la base de datos
     *
     * @param provincia
     */

    public void cargar_datos(String provincia) {
        vendedor v1 = new vendedor(1, "Maria", "meri", "Alicante", "Elche", "Av.Ferrocarril");
        vendedor v2 = new vendedor(2, "David", "da", "Alicante", "Alicante", "Av.Ferrocarril");
        vendedor v3 = new vendedor(3, "aaron", "aa", "Castellon", "castellon", "avenida");
        vendedor v4 = new vendedor(4, "Manuel", "manu", "Valencia", "Valencia", "calle castillo");
        V.add(v1);
        V.add(v2);
        V.add(v3);
        V.add(v4);

    }
}
