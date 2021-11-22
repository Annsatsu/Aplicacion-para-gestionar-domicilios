package persistencia;

import datos.Tienda;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class TiendaDao {
    private final String NOMBREAP = "tiendas.asi";
    private ArrayList<Tienda> listaTiendas;

    public TiendaDao() {
        if(abrirArchivo()==null){
            nuevoArchivo();
        }
    }

    private void nuevoArchivo(){
        listaTiendas=new ArrayList();
        FileOutputStream fo = null;

        try {
            fo = new FileOutputStream("tiendas.asi");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(listaTiendas);
            oo.close();
        } catch (FileNotFoundException var16) {
            var16.printStackTrace();
        } catch (IOException var17) {
            var17.printStackTrace();
        } finally {
            try {
                fo.close();
            } catch (IOException var15) {
            }
        }
    }

    public boolean guardarArchivo(ArrayList<Tienda> listaTiendas) {
        FileOutputStream fo = null;
        this.listaTiendas=listaTiendas;
        try {
            fo = new FileOutputStream("tiendas.asi");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(this.listaTiendas);
            oo.close();
            return true;
        } catch (FileNotFoundException var16) {
            var16.printStackTrace();
        } catch (IOException var17) {
            var17.printStackTrace();
        } finally {
            try {
                fo.close();
            } catch (IOException var15) {
            }
        }
        return false;
    }

    public ArrayList<Tienda> abrirArchivo() {
        FileInputStream fi = null;
        try {
            try {
                fi = new FileInputStream("tiendas.asi");
                ObjectInputStream oi = new ObjectInputStream(fi);
                this.listaTiendas = (ArrayList<Tienda>)oi.readObject();
                oi.close();
                fi.close();
                return listaTiendas;
            } catch (FileNotFoundException var10) {
                nuevoArchivo();
            } catch (IOException var11) {
                var11.printStackTrace();
            } catch (ClassNotFoundException var12) {
                var12.printStackTrace();
            }
            return null;
        } finally {

        }
    }
}
