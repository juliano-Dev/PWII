package com.site;


import java.util.Arrays;
import java.util.HashSet;

import org.eclipse.microprofile.jwt.Claims;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.smallrye.jwt.build.Jwt;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/valida")
public class ValidaPedido {
    
    @Inject
    @RestClient
    IPedido service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed("User")
    public boolean confirm(){
        Carro carro = service.carroPedido("ippg-4552", "2002", "VECTRA");
        return carro.isValidaPlaca();
    }
}
