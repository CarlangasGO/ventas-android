package empresa.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "FACTURA_CAB".
 */
public class FacturaCab implements java.io.Serializable {

    private long idfacturacab;
    private long idventacab;
    private long establecimiento;
    private long puntoexpedicion;
    private long nrofactura;
    private double importe;
    private double saldo;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public FacturaCab() {
    }

    public FacturaCab(long idfacturacab) {
        this.idfacturacab = idfacturacab;
    }

    public FacturaCab(long idfacturacab, long idventacab, long establecimiento, long puntoexpedicion, long nrofactura, double importe, double saldo) {
        this.idfacturacab = idfacturacab;
        this.idventacab = idventacab;
        this.establecimiento = establecimiento;
        this.puntoexpedicion = puntoexpedicion;
        this.nrofactura = nrofactura;
        this.importe = importe;
        this.saldo = saldo;
    }

    public long getIdfacturacab() {
        return idfacturacab;
    }

    public void setIdfacturacab(long idfacturacab) {
        this.idfacturacab = idfacturacab;
    }

    public long getIdventacab() {
        return idventacab;
    }

    public void setIdventacab(long idventacab) {
        this.idventacab = idventacab;
    }

    public long getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(long establecimiento) {
        this.establecimiento = establecimiento;
    }

    public long getPuntoexpedicion() {
        return puntoexpedicion;
    }

    public void setPuntoexpedicion(long puntoexpedicion) {
        this.puntoexpedicion = puntoexpedicion;
    }

    public long getNrofactura() {
        return nrofactura;
    }

    public void setNrofactura(long nrofactura) {
        this.nrofactura = nrofactura;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // KEEP METHODS - put your custom methods here

    @Override
    public String toString() {

        return "Facura Importe: " + getImporte() + " saldo: " + getSaldo() + " est: " + getEstablecimiento() + " pexp: "
                + getPuntoexpedicion() + " nro factura: " + getNrofactura() + " idventacab " + getIdventacab();

    }
    // KEEP METHODS END

}
