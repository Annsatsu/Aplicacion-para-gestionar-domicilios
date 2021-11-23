package logica;

import datos.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoCtrlTest {

    @Test
    void agregarProducto() {
        ProductoCtrl productoCtrl =new ProductoCtrl();
        Producto producto=new Producto();
        producto.setNombre("melon");
        producto.setPeso(0);
        producto.setPrecio(0);
        producto.setReferencia(54);
        producto.setCantidadProducto(10);
        productoCtrl.agregarProducto(producto);
    }

    @Test
    void buscarProducto() {
        ProductoCtrl productoCtrl= new ProductoCtrl();
        Producto producto=new Producto();
        System.out.println(productoCtrl.buscarProducto(54).getNombre());

    }

}