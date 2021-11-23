package logica;

import datos.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoCtrlTest {

    @Test
    void cargarProductos() {

    }

    @Test
    void actualizarPersistencia() {
    }

    @Test
    void agregarProducto() {
        ProductoCtrl productoCtrl =new ProductoCtrl();
        Producto producto=new Producto();
        producto.setNombre("guia");
        producto.setPeso(0);
        producto.setPrecio(0);
        producto.setReferencia(4);
        producto.setCantidadProducto(20);
        productoCtrl.agregarProducto(producto);
    }

    @Test
    void editarProducto() {
    }

    @Test
    void buscarProductos() {

    }

    @Test
    void buscarProducto() {
        ProductoCtrl productoCtrl= new ProductoCtrl();
        Producto producto=new Producto();
        System.out.println(productoCtrl.buscarProducto(1).getNombre());

    }

    @Test
    void eliminarProducto() {
    }
}