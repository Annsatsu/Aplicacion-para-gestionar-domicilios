package co.edu.ucentral.ingsf.springprime.bean;

import datos.Producto;
import logica.ProductoCtrl;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import persistencia.ProductoDao;

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
public class ListaProductosBean {
    List<Producto> productos;
    ProductoDao archivoProducto;

    public ListaProductosBean(){
        archivoProducto=new ProductoDao();
        productos=archivoProducto.abrirArchivo();
    }

    @PostConstruct
    public void init() throws IOException {
        productos = archivoProducto.abrirArchivo();

    }

}
