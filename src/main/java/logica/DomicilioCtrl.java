package logica;

import datos.Domicilio;
import persistencia.DomicilioDao;

import java.util.ArrayList;

public class DomicilioCtrl {
    private ArrayList<Domicilio> listaDomicilios;
    private Domicilio domicilio;

    public DomicilioCtrl(){
        cargarDomicilios();
    }

    public void cargarDomicilios(){
        DomicilioDao archivo = new DomicilioDao();
        listaDomicilios=archivo.abrirArchivo();
    }

    public void actualizarPersistencia(){
        DomicilioDao archivo=new DomicilioDao();
        archivo.guardarArchivo(listaDomicilios);
    }

    public boolean agregarDomicilio(Domicilio domicilio){
        if (domicilio==null)
            return false;
        if (listaDomicilios.isEmpty())
            cargarDomicilios();
        else{
            for (int i=0;i<listaDomicilios.size();i++){
                if (domicilio.getNumeroFactura()==listaDomicilios.get(i).getNumeroFactura()){
                    return false;
                }
            }
        }
        listaDomicilios.add(domicilio);
        actualizarPersistencia();
        return true;
    }

    public Domicilio buscarDomicilio(int numeroFactura){
        if (listaDomicilios==null){
            cargarDomicilios();
            return null;
        }
        if (listaDomicilios.isEmpty())
            return null;
        for (int i=0;i<listaDomicilios.size();i++){
            if (numeroFactura==listaDomicilios.get(i).getNumeroFactura()){
                return listaDomicilios.get(i);
            }
        }
        return null;
    }
}
