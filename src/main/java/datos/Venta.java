package datos;

public class Venta {
    private String nombreCliente;
    private int id;
    private String nombreTienda;
    private int cantidadProducto;
    private int referenciaProducto;

    public Venta(){

    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getReferenciaProducto() {
        return referenciaProducto;
    }

    public void setReferenciaProducto(int referenciaProducto) {
        this.referenciaProducto = referenciaProducto;
    }
}
