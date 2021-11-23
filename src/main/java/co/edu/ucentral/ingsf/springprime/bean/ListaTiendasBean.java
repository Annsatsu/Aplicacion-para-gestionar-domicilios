package co.edu.ucentral.ingsf.springprime.bean;

import datos.Tienda;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import persistencia.TiendaDao;

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

public class ListaTiendasBean {
    List<Tienda> tiendas;
    TiendaDao archivoTienda;

    public ListaTiendasBean(){
        archivoTienda= new TiendaDao();
        tiendas=archivoTienda.abrirArchivo();
    }

    @PostConstruct
    public void init() throws IOException{
        tiendas=archivoTienda.abrirArchivo();

    }
}
