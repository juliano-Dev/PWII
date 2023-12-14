package com.site;

//import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

//@RegisterRestClient(baseUri = "http://localhost:8081/service")

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carro {

    private String placa;
    private String ano;
    private String modelo;
    private boolean validaPlaca;

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isValidaPlaca() {
        return validaPlaca;
    }
    public void setValidaPlaca(boolean validaPlaca) {
        this.validaPlaca = validaPlaca;
    }
}
