package empresa.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "ZONA".
 */
public class Zona implements java.io.Serializable {

    private Long idzona;
    /** Not-null value. */
    private String descripcion;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Zona() {
    }

    public Zona(Long idzona) {
        this.idzona = idzona;
    }

    public Zona(Long idzona, String descripcion) {
        this.idzona = idzona;
        this.descripcion = descripcion;
    }

    public Long getIdzona() {
        return idzona;
    }

    public void setIdzona(Long idzona) {
        this.idzona = idzona;
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
        // TODO Auto-generated method stub
        return getDescripcion();
    }
    // KEEP METHODS END

}