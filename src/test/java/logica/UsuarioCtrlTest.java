package logica;

import datos.Usuario;
import org.junit.jupiter.api.Test;
import persistencia.UsuarioDao;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioCtrlTest {
    UsuarioCtrl userCtrl= new UsuarioCtrl();

    @Test
    void cargarUsuarios() {
    }

    @Test
    void acceder() {
    }

    @Test
    void crearUsuario() {
        UsuarioCtrlTest userTest= new UsuarioCtrlTest();
        Usuario user = new Usuario();
        UsuarioDao userDao= new UsuarioDao();
        UsuarioCtrl userCtrl = new UsuarioCtrl();

        user.setNombreUsuario("Admin");
        user.setContraseña("1234");
        user.setCorreo("anna@gmail.com");
        user.setTipoUsuario(1);
        userCtrl.crearUsuario(user);
    }

    @Test
    void cerrarSesion() {
    }

    @Test
    void buscarUsuario() {

        String a=userCtrl.buscarUsuario("Admin").getNombreUsuario();
        String b=userCtrl.buscarUsuario("Admin").getContraseña();
        int c=userCtrl.buscarUsuario("Admin").getTipoUsuario();
        System.out.println(a+"-"+b+" "+c);
    }

    @Test
    void buscarUsuarios() {
    }

    @Test
    void iniciarSesion(){
        int x= userCtrl.iniciarSesion("Admin","1234");
        System.out.println(x);
    }
}