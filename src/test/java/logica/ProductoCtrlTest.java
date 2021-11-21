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
        producto.setNombre("Papas");
        producto.setPeso(120);
        producto.setPrecio(1200.2);
        producto.setReferencia(1);
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