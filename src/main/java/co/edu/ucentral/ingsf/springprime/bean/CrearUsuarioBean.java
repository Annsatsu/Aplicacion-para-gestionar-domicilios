package co.edu.ucentral.ingsf.springprime.bean;

import datos.Usuario;
import logica.UsuarioCtrl;
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

public class CrearUsuarioBean implements Serializable {
    private String nombreUsuario="";
    private String contraseña="";

    public void crearUsuario(){
        Usuario usuario=new Usuario();
        usuario.setNombreUsuario(nombreUsuario);
        usuario.setContraseña(contraseña);
        usuario.setTipoUsuario(2);

        if (nombreUsuario!="" && contraseña!=""){
            UsuarioCtrl userCtrl = new UsuarioCtrl();
            if (userCtrl.crearUsuario(usuario)) {
                nombreUsuario="";
                contraseña="";
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage("Usuario creado"));
            }else{
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage("Datos invalidos"));
            }
        }else{
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage("Rellene los campos, por favor."));
        }
    }

}
