
package Reportes;

public class ListadoVentas {

    public ListadoVentas(String numfactura, String dpi, String nombreusuario, String nit, String nombrecliente, String fecha, String efectivo, String cambio, String totalsiniva, String total) {
        this.numfactura = numfactura;
        this.dpi = dpi;
        this.nombreusuario = nombreusuario;
        this.nit = nit;
        this.nombrecliente = nombrecliente;
        this.fecha = fecha;
        this.efectivo = efectivo;
        this.cambio = cambio;
        this.totalsiniva = totalsiniva;
        this.total = total;
    }

    public String getNumfactura() {
        return numfactura;
    }

    public void setNumfactura(String numfactura) {
        this.numfactura = numfactura;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(String efectivo) {
        this.efectivo = efectivo;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getTotalsiniva() {
        return totalsiniva;
    }

    public void setTotalsiniva(String totalsiniva) {
        this.totalsiniva = totalsiniva;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    private String numfactura;
    private String dpi;
    private String nombreusuario;
    private String nit;
    private String nombrecliente;
    private String fecha;
    private String efectivo;
    private String cambio;
    private String totalsiniva;
    private String total;
}
