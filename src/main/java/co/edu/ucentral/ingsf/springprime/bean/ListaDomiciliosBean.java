package co.edu.ucentral.ingsf.springprime.bean;

import datos.Domicilio;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import persistencia.DomicilioDao;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

@Component
@ManagedBean
@ViewScoped
@Getter
@Setter
@RequestScoped

public class ListaDomiciliosBean implements Serializable {
    List<Domicilio> domicilios;
    DomicilioDao archivoDomicilio;

    public ListaDomiciliosBean(){
        archivoDomicilio= new DomicilioDao();
        domicilios=archivoDomicilio.abrirArchivo();
    }

    @PostConstruct
    public void init()throws IOException{
        domicilios=archivoDomicilio.abrirArchivo();
    }

}
