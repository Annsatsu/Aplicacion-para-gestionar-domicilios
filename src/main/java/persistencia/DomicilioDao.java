package persistencia;

import datos.Domicilio;

import java.io.*;
import java.util.ArrayList;

public class DomicilioDao {
    private final String NOMBREAP = "domicilios.asi";
    private ArrayList<Domicilio> listaDomicilios;

    public DomicilioDao() {
        if(abrirArchivo()==null){
            nuevoArchivo();
        }
    }

    private void nuevoArchivo(){
        listaDomicilios=new ArrayList();
        FileOutputStream fo = null;

        try {
            fo = new FileOutputStream("domicilios.asi");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(listaDomicilios);
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

    public boolean guardarArchivo(ArrayList<Domicilio> listaDomicilios) {
        FileOutputStream fo = null;
        this.listaDomicilios=listaDomicilios;
        try {
            fo = new FileOutputStream("domicilios.asi");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(this.listaDomicilios);
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

    public ArrayList<Domicilio> abrirArchivo() {
        FileInputStream fi = null;
        try {
            try {
                fi = new FileInputStream("domicilios.asi");
                ObjectInputStream oi = new ObjectInputStream(fi);
                this.listaDomicilios= (ArrayList<Domicilio>)oi.readObject();
                oi.close();
                fi.close();
                return listaDomicilios;
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
