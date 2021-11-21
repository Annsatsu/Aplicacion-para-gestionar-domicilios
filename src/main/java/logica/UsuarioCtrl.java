package logica;

import datos.Usuario;
import persistencia.UsuarioDao;

import java.util.ArrayList;

public class UsuarioCtrl {
    private ArrayList<Usuario> usuarios;
    private UsuarioDao userDao;
    private Usuario usuario;

    public UsuarioCtrl() {
        cargarUsuarios();
    }

    public void actualizarPersistencia(){
        userDao=new UsuarioDao();
        userDao.guardarArchivo(usuarios);
    }
    private void cargarUsuarios(){
        userDao = new UsuarioDao();
        usuarios=userDao.abrirArchivo();

    }

    private boolean acceder(String nombreUsuario,String contraseña){
        return false;
    }

    private boolean crearUsuario(String nombreUsuario,String contraseña,String correo){
        if(usuarios==null)
            return false;
        if (usuarios.isEmpty())
            cargarUsuarios();
        else{
            for (int i=0;i<usuarios.size();i++){
                if(usuario.getNombreUsuario()==usuarios.get(i).getNombreUsuario())
                    return false;
            }
        }
        if (usuarios==null)
            usuarios=new ArrayList<Usuario>();

        usuarios.add(usuario);
        actualizarPersistencia();
        return true;
    }

    private boolean cerrarSesion(){
        return false;
    }

    private Usuario buscarUsuario(String nombreUsuario){
        if (usuarios==null){
            cargarUsuarios();
            return null;
        }
        for (int i=0;i< usuarios.size();i++){
            if (nombreUsuario==usuarios.get(i).getNombreUsuario())
                return usuarios.get(i);
        }
        return null;
    }

    private ArrayList buscarUsuarios(){
        return null;
    }
}
