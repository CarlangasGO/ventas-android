package empresa.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "EMPRESA".
 */
public class Empresa {

    private Long idempresa;
    /** Not-null value. */
    private String descripcion;
    private String abreviacion;

    // KEEP FIELDS - se colocarian los campos de las empresas aqui
    public static final long empresa1  = 2;
    public static final long empresa2  = 4;
    // KEEP FIELDS END

    public Empresa() {
    }

    public Empresa(Long idempresa) {
        this.idempresa = idempresa;
    }

    public Empresa(Long idempresa, String descripcion, String abreviacion) {
        this.idempresa = idempresa;
        this.descripcion = descripcion;
        this.abreviacion = abreviacion;
    }

    public Long getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Long idempresa) {
        this.idempresa = idempresa;
    }

    /** Not-null value. */
    public String getDescripcion() {
        return descripcion;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
    }

    // KEEP METHODS - put your custom methods here
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getDescripcion();
    }
    // KEEP METHODS END

}
