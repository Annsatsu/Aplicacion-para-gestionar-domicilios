package co.edu.ucentral.ingsf.springprime.bean;

import datos.Producto;
import logica.ProductoCtrl;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

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

public class GerenteBean implements Serializable {
    private String nombre="";
    private int peso=0;
    private double precio=0;
    private int referencia=0;

    public void agregarProducto(){
        Producto producto= new Producto();
        producto.setNombre(nombre);
        producto.setPeso(peso);
        producto.setPrecio(precio);
        producto.setReferencia(referencia);

        if (nombre!="" && peso!=0 && precio!=0 && referencia!=0){
            ProductoCtrl ctrl= new ProductoCtrl();
            if (ctrl.agregarProducto(producto)){
                nombre="";
                peso=0;
                precio=0;
                referencia=0;
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage("Producto creado"));
            }else{
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage("Compruebe la información suministrada"));
            }
        }else{
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage("Rellene los campos, por favor."));
        }
    }
}
