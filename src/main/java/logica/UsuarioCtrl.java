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
    public void cargarUsuarios(){
        userDao = new UsuarioDao();
        usuarios=userDao.abrirArchivo();

    }

    public int iniciarSesion(String nombreUsuario,String contraseña){
        if (buscarUsuario(nombreUsuario)!=null){
            if (buscarUsuario(nombreUsuario).getContraseña().equals(contraseña)){
                return buscarUsuario(nombreUsuario).getTipoUsuario();
            }
        }
        return 0;
    }

    public boolean crearUsuario(Usuario usuario){
        if(usuarios==null)
            return false;
        if (usuarios.isEmpty())
            cargarUsuarios();
        else{
            for (int i=0;i<usuarios.size();i++){
                if(usuario.getNombreUsuario().equals(usuarios.get(i).getNombreUsuario()))
                    return false;
            }
        }
        if (usuarios==null)
            usuarios=new ArrayList<Usuario>();

        usuarios.add(usuario);
        actualizarPersistencia();
        return true;
    }


    public Usuario buscarUsuario(String nombreUsuario){
        if (usuarios==null){
            cargarUsuarios();
        }
        if (usuarios.isEmpty()){
            return null;
        }
        for (int i=0;i< usuarios.size();i++){
            if (nombreUsuario.equals(usuarios.get(i).getNombreUsuario()))
                return usuarios.get(i);
        }
        return null;
    }
}
