package empresa.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

import tpoffline.NullObject;

/**
 * Entity mapped to table "COLECCION_PRODUCTO".
 */
public class ColeccionProducto implements java.io.Serializable {

    private Long idcoleccionproducto;
    private long idcoleccion;
    private long idproducto;
    /** Not-null value. */
    private String descripcion;

    // KEEP FIELDS - put your custom fields here

    public static final ColeccionProducto COLECCION_TODAS = new ColeccionProducto(-1L,
            Coleccion.COLECCION_TODAS_LAS_COLECCIONES.getIdcoleccion() , -1L, "TODAS LAS COLECCIONES");

    public static final ColeccionProducto COLECCION_NINGUNA = new ColeccionProducto(-2L,
            Coleccion.COLECCION_TODAS_LAS_COLECCIONES.getIdcoleccion() , -2L, "Ninguno");
    // KEEP FIELDS END

    public ColeccionProducto() {
    }

    public ColeccionProducto(Long idcoleccionproducto) {
        this.idcoleccionproducto = idcoleccionproducto;
    }

    public ColeccionProducto(Long idcoleccionproducto, long idcoleccion, long idproducto, String descripcion) {
        this.idcoleccionproducto = idcoleccionproducto;
        this.idcoleccion = idcoleccion;
        this.idproducto = idproducto;
        this.descripcion = descripcion;
    }

    public Long getIdcoleccionproducto() {
        return idcoleccionproducto;
    }

    public void setIdcoleccionproducto(Long idcoleccionproducto) {
        this.idcoleccionproducto = idcoleccionproducto;
    }

    public long getIdcoleccion() {
        return idcoleccion;
    }

    public void setIdcoleccion(long idcoleccion) {
        this.idcoleccion = idcoleccion;
    }

    public long getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(long idproducto) {
        this.idproducto = idproducto;
    }

    /** Not-null value. */
    public String getDescripcion() {
        return descripcion;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // KEEP METHODS - put your custom methods here

    @Override
    public String toString() {
        if(getIdcoleccion() == Coleccion.COLECCION_TODAS_LAS_COLECCIONES.getIdcoleccion() ||
                getIdcoleccion()  == NullObject.NULL_COLECCION_PRODUCTO.getIdcoleccion() ) {
            return getDescripcion();
        } else {
            return getIdcoleccion() + " " + getDescripcion();
        }


    }

    @Override
    public int hashCode() {
        return ( getIdcoleccion() + "" + getIdproducto()).hashCode();
    }

    @Override
    public boolean equals(Object otro) {
        if(otro instanceof ColeccionProducto) {
            ColeccionProducto cpOtro = (ColeccionProducto)otro;
            return cpOtro.hashCode() == hashCode();
        } else {
            return false;
        }
    }
    // KEEP METHODS END

}
