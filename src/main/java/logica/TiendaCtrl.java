package logica;

import datos.Producto;
import datos.Tienda;
import persistencia.TiendaDao;

import java.util.ArrayList;

public class TiendaCtrl {
    private ArrayList<Tienda> listaTiendas;
    private TiendaDao tiendaDao;
    private Tienda tienda;

    public TiendaCtrl(){
        cargarTiendas();

    }

    public void cargarTiendas(){
        tiendaDao=new TiendaDao();
        listaTiendas=tiendaDao.abrirArchivo();
    }

    public void actualizarPersistencia(){
        tiendaDao=new TiendaDao();
        tiendaDao.guardarArchivo(listaTiendas);
    }

    public void asociarProducto(int referencia){


    }
    public boolean agregarTienda(Tienda tienda){
        if (tienda==null)
            return false;

        if (listaTiendas==null)
            listaTiendas=new ArrayList<Tienda>();

        if (listaTiendas.isEmpty())
            cargarTiendas();
        else{
            for (int i=0;i<listaTiendas.size();i++){
                if (tienda.getId()==listaTiendas.get(i).getId())
                    return false;
            }
        }
        listaTiendas.add(tienda);
        actualizarPersistencia();
        return true;
    }
}
