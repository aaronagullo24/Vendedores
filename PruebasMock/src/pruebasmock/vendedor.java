
package pruebasmock;

/**
 *
 * @author Aaron
 */
public class vendedor {

    public int numvend;
    public String nomvend;
    public String nombrecomer;
    public String provincia;
    public String localidad;
    public String direccion;

    /**
     * Creamos el contructor
     *
     * @param numvend
     * @param nomvend
     * @param nombrecomer
     * @param provincia
     * @param localidad
     * @param direccion
     */
    public vendedor(int numvend, String nomvend, String nombrecomer, String provincia, String localidad, String direccion) {
        this.numvend = numvend;
        this.nomvend = nomvend;
        this.nombrecomer = nombrecomer;
        this.provincia = provincia;
        this.localidad = localidad;
        this.direccion = direccion;
    }

    /**
     * para mostrar el numero de vendedor
     *
     * @return
     */
    public int getNumvend() {
        return numvend;
    }

    /**
     * para usar el numero de vendedor
     *
     * @param numvend
     */
    public void setNumvend(int numvend) {
        this.numvend = numvend;
    }

    /**
     * para mostar en nombre del vendedor
     *
     * @return
     */
    public String getNomvend() {
        return nomvend;
    }

    /**
     * para usar el nombre del vendedor
     *
     * @param nomvend
     */
    public void setNomvend(String nomvend) {
        this.nomvend = nomvend;
    }

    /**
     * mostrar el nombre del comercio
     *
     * @return
     */
    public String getNombrecomer() {
        return nombrecomer;
    }

    /**
     * para usar el nombre del comercio
     *
     * @param nombrecomer
     */
    public void setNombrecomer(String nombrecomer) {
        this.nombrecomer = nombrecomer;
    }

    /**
     * mostrar el nombre de la provincia
     *
     * @return
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * para usar el nombre de la provincia
     *
     * @param provincia
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * para mostrar la localidad
     *
     * @return
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * para usar la localidad
     *
     * @param localidad
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * mostrar la direccion
     *
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * para usar la direccion
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.numvend;
        return hash;
    }

    /**
     * Metodo equals sobreescrito para que compare nombre y numero de vendedor
     *
     * @param obj
     * @return
     */
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
        final vendedor other = (vendedor) obj;
        if (this.numvend != other.numvend || !this.nomvend.equals(other.nomvend)) {
            return false;
        }
        return true;
    }

}
