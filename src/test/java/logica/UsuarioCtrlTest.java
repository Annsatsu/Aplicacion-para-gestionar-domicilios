package logica;

import datos.Usuario;
import org.junit.jupiter.api.Test;
import persistencia.UsuarioDao;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioCtrlTest {
    UsuarioCtrl userCtrl= new UsuarioCtrl();

    @Test
    void crearUsuario() {
        Usuario user = new Usuario();
        UsuarioCtrl userCtrl = new UsuarioCtrl();
        user.setNombreUsuario("Admin");
        user.setContraseña("1234");
        user.setTipoUsuario(1);
        userCtrl.crearUsuario(user);
    }

    @Test
    void buscarUsuario() {
        String a=userCtrl.buscarUsuario("Gerente").getNombreUsuario();
        String b=userCtrl.buscarUsuario("Gerente").getContraseña();
        int c=userCtrl.buscarUsuario("Gerente").getTipoUsuario();
        System.out.println(a+"-"+b+"-"+c);
    }

    @Test
    void iniciarSesion(){
        int x= userCtrl.iniciarSesion("Gerente","1234");
        System.out.println(x);
    }
}