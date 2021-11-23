package logica;

import datos.Domicilio;
import datos.Producto;
import org.junit.jupiter.api.Test;
import persistencia.DomicilioDao;
import persistencia.ProductoDao;
import persistencia.TiendaDao;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DomicilioCtrlTest {
    DomicilioCtrl domicilioCtrl= new DomicilioCtrl();


    @Test
    void agregarDomicilio() {
        DomicilioCtrl domicilioCtrl= new DomicilioCtrl();
        ArrayList<Producto> listaProductos= new ArrayList<>();
        Domicilio domicilio=new Domicilio();

        ProductoDao productoDao= new ProductoDao();
        domicilio.setNumeroFactura(10);
        domicilio.setNombreCliente("Camilo");
        listaProductos.add(productoDao.abrirArchivo().get(0));
        listaProductos.add(productoDao.abrirArchivo().get(1));
        domicilio.setProductos(listaProductos);
        domicilio.setTienda(1);
        domicilioCtrl.agregarDomicilio(domicilio);
    }

    @Test
    void buscarDomicilio() {
        String a= domicilioCtrl.buscarDomicilio(10).getNombreCliente();

        System.out.println("Cliente: "+a+"Tienda: ");
    }
}