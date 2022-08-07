package br.com.throchadev;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/{cep}")
@Produces(MediaType.APPLICATION_JSON)
public class GreetingResource {

    @RestClient
    ViaCepClient viaCepClient;

    @GET
    public String getCep(@PathParam("cep") String cep){
        return viaCepClient.getCep(cep);
    }
}