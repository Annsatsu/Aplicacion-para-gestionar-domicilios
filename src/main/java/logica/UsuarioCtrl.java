package logica;

import datos.Usuario;

import java.util.ArrayList;

public class UsuarioCtrl {
    private ArrayList<Usuario> usuarios;

    private boolean acceder(String nombreUsuario,String contraseña){
        return false;
    }

    private boolean crearUsuario(String nombreUsuario,String contraseña,String correo){
        return false;
    }

    private boolean cerrarSesion(){
        return false;
    }

    private Usuario buscarUsuario(String nombreUsuario){
        return null;
    }

    private ArrayList buscarUsuarios(){
        return null;
    }

    private boolean borrarUsuario(Usuario usuario){
        return false;
    }
}
