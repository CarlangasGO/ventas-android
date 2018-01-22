package empresa.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "TIPO_PERSONA".
 */
public class TipoPersona implements java.io.Serializable {

    private Long codtipopersona;
    /** Not-null value. */
    private String descripcion;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public TipoPersona() {
    }

    public TipoPersona(Long codtipopersona) {
        this.codtipopersona = codtipopersona;
    }

    public TipoPersona(Long codtipopersona, String descripcion) {
        this.codtipopersona = codtipopersona;
        this.descripcion = descripcion;
    }

    public Long getCodtipopersona() {
        return codtipopersona;
    }

    public void setCodtipopersona(Long codtipopersona) {
        this.codtipopersona = codtipopersona;
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
        return getDescripcion();
    }
    // KEEP METHODS END

}