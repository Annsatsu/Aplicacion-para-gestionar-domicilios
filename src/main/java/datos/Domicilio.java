package datos;

import java.io.Serializable;
import java.util.ArrayList;

public class Domicilio implements Serializable {
    private String nombreCliente;
    private int numeroFactura;
    private int idTienda;
    private ArrayList<Producto> productos;

    public Domicilio() {
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public int getIdTienda() {
        return idTienda;
    }

    public void setTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
