package empresa.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "CLIENTE_PRODUCTO".
 */
public class ClienteProducto implements java.io.Serializable {

    private Long idcliente;
    private Long idproducto;
    private Long idempresa;
    private Boolean estado;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public ClienteProducto() {
    }

    public ClienteProducto(Long idcliente, Long idproducto, Long idempresa, Boolean estado) {
        this.idcliente = idcliente;
        this.idproducto = idproducto;
        this.idempresa = idempresa;
        this.estado = estado;
    }

    public Long getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Long idcliente) {
        this.idcliente = idcliente;
    }

    public Long getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Long idproducto) {
        this.idproducto = idproducto;
    }

    public Long getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Long idempresa) {
        this.idempresa = idempresa;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
