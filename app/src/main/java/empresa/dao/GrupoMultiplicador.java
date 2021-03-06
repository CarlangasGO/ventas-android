package empresa.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "GRUPO_MULTIPLICADOR".
 */
public class GrupoMultiplicador implements java.io.Serializable {

    private Long idgrupo;
    private Long multiplicador;
    /** Not-null value. */
    private String descripcion;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public GrupoMultiplicador() {
    }

    public GrupoMultiplicador(Long idgrupo) {
        this.idgrupo = idgrupo;
    }

    public GrupoMultiplicador(Long idgrupo, Long multiplicador, String descripcion) {
        this.idgrupo = idgrupo;
        this.multiplicador = multiplicador;
        this.descripcion = descripcion;
    }

    public Long getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(Long idgrupo) {
        this.idgrupo = idgrupo;
    }

    public Long getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(Long multiplicador) {
        this.multiplicador = multiplicador;
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
        return "GrupoMultiplicador id " + getIdgrupo() + " " + getDescripcion() + " multiplo " + getMultiplicador();
    }
    // KEEP METHODS END

}
