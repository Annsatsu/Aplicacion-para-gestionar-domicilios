package co.edu.ucentral.ingsf.springprime.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

@Component
@ManagedBean
@ViewScoped
@Getter
@Setter
@RequestScoped

public class IniciarSesionBean {
    private String texto;

    @PostConstruct
    public void init(){

    }

    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
}
