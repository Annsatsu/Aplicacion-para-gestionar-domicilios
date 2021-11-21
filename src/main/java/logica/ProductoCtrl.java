package logica;

import datos.Producto;
import persistencia.ProductoDao;
import java.util.ArrayList;

public class ProductoCtrl {
    private ArrayList<Producto> listaProductos;
    private Producto producto;

    public ProductoCtrl() {
        cargarProductos();
    }

    public void cargarProductos(){
        ProductoDao archivo=new ProductoDao();
        listaProductos=archivo.abrirArchivo();
    }

    public void actualizarPersistencia(){
        ProductoDao archivo=new ProductoDao();
        archivo.guardarArchivo(listaProductos);
    }

    public boolean agregarProducto(Producto producto){
        if (producto==null)
            return false;

        if (listaProductos==null)
            listaProductos=new ArrayList<>();

        if (listaProductos.isEmpty())
            cargarProductos();
        else{
            for (int i=0;i<listaProductos.size();i++){
                if (producto.getReferencia() == listaProductos.get(i).getReferencia())
                    return false;
            }
        }
        listaProductos.add(producto);
        actualizarPersistencia();
        return true;
    }

    public boolean editarProducto(Producto producto){
        return false;


    }

    public Producto buscarProducto(int referencia){
        if(listaProductos==null){
            cargarProductos();
            return null;
        }
        if (listaProductos.isEmpty())
            return null;

        for (int i=0;i<listaProductos.size();i++){
            if(referencia==listaProductos.get(i).getReferencia())
                return listaProductos.get(i);
        }
        return null;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public boolean eliminarProducto(Producto producto){
        return false;
    }
}
