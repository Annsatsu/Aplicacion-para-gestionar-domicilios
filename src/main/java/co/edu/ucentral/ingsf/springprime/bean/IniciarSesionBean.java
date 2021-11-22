package co.edu.ucentral.ingsf.springprime.bean;

import logica.UsuarioCtrl;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@Component
@ManagedBean
@ViewScoped
@Getter
@Setter
@RequestScoped

public class IniciarSesionBean {
    private String usuario;
    private String contraseña;
    private UsuarioCtrl userCtrl= new UsuarioCtrl();

    public String iniciarSesion(){
        if (usuario!=null && contraseña!=null){
            if (userCtrl.iniciarSesion(usuario,contraseña)==1)
                return "administrador";
            if(userCtrl.iniciarSesion(usuario,contraseña)==2)
                return "gerente";
            if (userCtrl.iniciarSesion(usuario,contraseña)==0){
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage("El usuario no existe"));
                return "";
            }
        }
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Rellene los campos"));
        return "";
    }


}
