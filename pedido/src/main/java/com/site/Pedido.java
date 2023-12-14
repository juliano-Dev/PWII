package com.site;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/pedido")
public class Pedido {

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed("User")
    public Carro varificaCarro(
        @FormParam("placa") String placa,
        @FormParam("ano") String ano,
        @FormParam("modelo") String modelo){
            Carro carro = new Carro();
                carro.setPlaca(placa);
                carro.setAno(ano);
                carro.setModelo(modelo);            
            return carro;

        } 

    

   

    
}
