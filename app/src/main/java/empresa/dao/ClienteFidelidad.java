package empresa.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "CLIENTE_FIDELIDAD".
 */
public class ClienteFidelidad {

    private long idcliente;
    private long idoficial;
    private long idproducto;
    private long idcoleccion;
    private long cantidadanterior;
    private long cantidadmeta;
    private long descuentometa;
    private long penalizacion;
    private long descuentoactumulado;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public ClienteFidelidad() {
    }

    public ClienteFidelidad(long idcliente, long idoficial, long idproducto, long idcoleccion, long cantidadanterior, long cantidadmeta, long descuentometa, long penalizacion, long descuentoactumulado) {
        this.idcliente = idcliente;
        this.idoficial = idoficial;
        this.idproducto = idproducto;
        this.idcoleccion = idcoleccion;
        this.cantidadanterior = cantidadanterior;
        this.cantidadmeta = cantidadmeta;
        this.descuentometa = descuentometa;
        this.penalizacion = penalizacion;
        this.descuentoactumulado = descuentoactumulado;
    }

    public long getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(long idcliente) {
        this.idcliente = idcliente;
    }

    public long getIdoficial() {
        return idoficial;
    }

    public void setIdoficial(long idoficial) {
        this.idoficial = idoficial;
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

    public long getCantidadanterior() {
        return cantidadanterior;
    }

    public void setCantidadanterior(long cantidadanterior) {
        this.cantidadanterior = cantidadanterior;
    }

    public long getCantidadmeta() {
        return cantidadmeta;
    }

    public void setCantidadmeta(long cantidadmeta) {
        this.cantidadmeta = cantidadmeta;
    }

    public long getDescuentometa() {
        return descuentometa;
    }

    public void setDescuentometa(long descuentometa) {
        this.descuentometa = descuentometa;
    }

    public long getPenalizacion() {
        return penalizacion;
    }

    public void setPenalizacion(long penalizacion) {
        this.penalizacion = penalizacion;
    }

    public long getDescuentoactumulado() {
        return descuentoactumulado;
    }

    public void setDescuentoactumulado(long descuentoactumulado) {
        this.descuentoactumulado = descuentoactumulado;
    }

    // KEEP METHODS - put your custom methods here
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "ClienteFidelidad: col " + getIdcoleccion() + " idp " + getIdproducto() + " idoficial " + getIdoficial()
                + " descuentometa " + getDescuentometa() + " desc acumulado" + getDescuentoactumulado() +
                " penalizacion " + getPenalizacion();
    }
    // KEEP METHODS END

}
