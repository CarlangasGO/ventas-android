package empresa.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "USUARIO_PRODUCTO".
 */
public class UsuarioProducto {

    private String idusuario_idproducto;
    private Long idproducto;
    private Long idusuario;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public UsuarioProducto() {
    }

    public UsuarioProducto(String idusuario_idproducto) {
        this.idusuario_idproducto = idusuario_idproducto;
    }

    public UsuarioProducto(String idusuario_idproducto, Long idproducto, Long idusuario) {
        this.idusuario_idproducto = idusuario_idproducto;
        this.idproducto = idproducto;
        this.idusuario = idusuario;
    }

    public String getIdusuario_idproducto() {
        return idusuario_idproducto;
    }

    public void setIdusuario_idproducto(String idusuario_idproducto) {
        this.idusuario_idproducto = idusuario_idproducto;
    }

    public Long getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Long idproducto) {
        this.idproducto = idproducto;
    }

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    // KEEP METHODS - put your custom methods here
    @Override
    public String toString() {

        return "usuario_producto: " + getIdusuario_idproducto();
    }
    // KEEP METHODS END

}
