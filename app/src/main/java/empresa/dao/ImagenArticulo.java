package empresa.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "IMAGEN_ARTICULO".
 */
public class ImagenArticulo implements java.io.Serializable {

    private Long idarticuloimagen;
    private long idproducto;
    private long idcoleccion;
    private String referencia;
    private String md5;
    private Double size;
    private byte[] imagen;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public ImagenArticulo() {
    }

    public ImagenArticulo(Long idarticuloimagen) {
        this.idarticuloimagen = idarticuloimagen;
    }

    public ImagenArticulo(Long idarticuloimagen, long idproducto, long idcoleccion, String referencia, String md5, Double size, byte[] imagen) {
        this.idarticuloimagen = idarticuloimagen;
        this.idproducto = idproducto;
        this.idcoleccion = idcoleccion;
        this.referencia = referencia;
        this.md5 = md5;
        this.size = size;
        this.imagen = imagen;
    }

    public Long getIdarticuloimagen() {
        return idarticuloimagen;
    }

    public void setIdarticuloimagen(Long idarticuloimagen) {
        this.idarticuloimagen = idarticuloimagen;
    }

    public long getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(long idproducto) {
        this.idproducto = idproducto;
    }

    public long getIdcoleccion() {
        return idcoleccion;
    }

    public void setIdcoleccion(long idcoleccion) {
        this.idcoleccion = idcoleccion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    // KEEP METHODS - put your custom methods here

    @Override
    public boolean equals(Object otro) {
        if(otro instanceof ImagenArticulo) {
            return ((ImagenArticulo)otro).getMd5().equals(getMd5());
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return getMd5().hashCode();
    }
    // KEEP METHODS END

}
