package co.edu.ucentral.ingsf.springprime.bean;

import datos.Usuario;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import persistencia.UsuarioDao;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import java.io.IOException;
import java.util.List;

@Component
@ManagedBean
@ViewScoped
@Getter
@Setter
@RequestScoped
public class ListaUsuariosBean {
    List<Usuario> usuarios;
    UsuarioDao archivoUsuarios;

    public ListaUsuariosBean(){
        archivoUsuarios=new UsuarioDao();
        archivoUsuarios.abrirArchivo();
    }
    @PostConstruct
    public void init() throws IOException {
        usuarios=archivoUsuarios.abrirArchivo();
    }
}