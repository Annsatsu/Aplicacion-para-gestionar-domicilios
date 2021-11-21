package co.edu.ucentral.ingsf.springprime.bean;

import datos.Tienda;
import logica.TiendaCtrl;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import persistencia.ProductoDao;
import persistencia.TiendaDao;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;

@Component
@ManagedBean
@ViewScoped
@Getter
@Setter
@RequestScoped

public class AdministradorBean implements Serializable {
    private int id;
    private String nombre;
    private String direccion;
    private String nombreBarrio;

    public void agregarTienda(){
        Tienda tienda = new Tienda();
        tienda.setId(id);
        tienda.setNombre(nombre);
        tienda.setDireccion(direccion);
        tienda.setNombreBarrio(nombreBarrio);

        ProductoDao producto = new ProductoDao();
        tienda.setProductos(producto.abrirArchivo());

        if (id!=0 && nombre!="" && direccion!="" && nombreBarrio!=""){
            TiendaCtrl ctrl = new TiendaCtrl();
            if(ctrl.agregarTienda(tienda)){
                id=0;
                nombre="";
                direccion="";
                nombreBarrio="";
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage("Tienda creada"));
            }else {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage("Compruebe la información suministrada"));
            }
        }else {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage("Rellene los campos, por favor."));
        }

    }

}
