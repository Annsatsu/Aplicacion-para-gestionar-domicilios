package logica;

import datos.Producto;
import datos.Tienda;
import org.junit.jupiter.api.Test;
import persistencia.ProductoDao;
import java.util.ArrayList;

class TiendaCtrlTest {

    @Test
    void agregarTienda() {
        TiendaCtrl tiendaCtrl=new TiendaCtrl();
        Tienda tienda= new Tienda();
        ArrayList<Producto> array = new ArrayList();
        ProductoDao productoDao= new ProductoDao();
        tienda.setId(1);
        tienda.setNombre("La esquina de manuel");
        tienda.setDireccion("Calle");
        tienda.setNombreBarrio("Techo");
        array=productoDao.abrirArchivo();
        tienda.setProductos(array);
        tiendaCtrl.agregarTienda(tienda);

    }
}