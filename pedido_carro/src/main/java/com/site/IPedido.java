package com.site;



import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient(baseUri = "https://localhost:8444")
public interface IPedido {

    @POST
    @Path("/pedido")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)

    public Carro carroPedido(
        @FormParam("placa") String placa,
        @FormParam("ano") String ano,
        @FormParam("modelo") String modelo);    
    
}
