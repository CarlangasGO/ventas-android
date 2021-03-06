package empresa.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "PROMEDIO_POR_COLECCION".
 */
public class PromedioPorColeccion {

    private Long idpromedioporcoleccion;
    private double promedioprecio;
    private Long idcoleccion;
    private long idusuario;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public PromedioPorColeccion() {
    }

    public PromedioPorColeccion(Long idpromedioporcoleccion) {
        this.idpromedioporcoleccion = idpromedioporcoleccion;
    }

    public PromedioPorColeccion(Long idpromedioporcoleccion, double promedioprecio, Long idcoleccion, long idusuario) {
        this.idpromedioporcoleccion = idpromedioporcoleccion;
        this.promedioprecio = promedioprecio;
        this.idcoleccion = idcoleccion;
        this.idusuario = idusuario;
    }

    public Long getIdpromedioporcoleccion() {
        return idpromedioporcoleccion;
    }

    public void setIdpromedioporcoleccion(Long idpromedioporcoleccion) {
        this.idpromedioporcoleccion = idpromedioporcoleccion;
    }

    public double getPromedioprecio() {
        return promedioprecio;
    }

    public void setPromedioprecio(double promedioprecio) {
        this.promedioprecio = promedioprecio;
    }

    public Long getIdcoleccion() {
        return idcoleccion;
    }

    public void setIdcoleccion(Long idcoleccion) {
        this.idcoleccion = idcoleccion;
    }

    public long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(long idusuario) {
        this.idusuario = idusuario;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
