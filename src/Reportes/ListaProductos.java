
package Reportes;

public class ListaProductos {

    public ListaProductos(String codigo, String descripcion, String marca, String precio, String stock, String diasparavencer) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
        this.diasparavencer = diasparavencer;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getDiasparavencer() {
        return diasparavencer;
    }

    public void setDiasparavencer(String diasparavencer) {
        this.diasparavencer = diasparavencer;
    }
    private String codigo;
    private String descripcion;
    private String marca;
    private String precio;
    private String stock;
    private String diasparavencer;
}
