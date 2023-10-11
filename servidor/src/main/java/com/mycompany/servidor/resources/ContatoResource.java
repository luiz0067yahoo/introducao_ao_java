package com.mycompany.servidor.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.servidor.Contato;

/**
 *
 * @author 
 */

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
@Path("contatos")
public class ContatoResource {
    private static List<Contato> contatos = new ArrayList<>();

    @GET
    @Produces("application/json")
    public List<Contato> getContatos() {
        return contatos;
    }

    @GET
    @Path("{id}")
    @Produces("application/json")
    public Contato getContato(@PathParam("id") int id) {
        for (Contato contato : contatos) {
            if (contato.getId() == id) {
                return contato;
            }
        }
        throw new NotFoundException("Contato não encontrado");
    }

    @POST
    @Consumes("application/json")
    public Response addContato(Contato contato) {
        contatos.add(contato);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("{id}")
    @Consumes("application/json")
    public Response updateContato(@PathParam("id") int id, Contato contato) {
        for (Contato c : contatos) {
            if (c.getId() == id) {
                c.setNome(contato.getNome());
                c.setTelefone(contato.getTelefone());
                return Response.status(Response.Status.OK).build();
            }
        }
        throw new NotFoundException("Contato não encontrado");
    }

    @DELETE
    @Path("{id}")
    public Response deleteContato(@PathParam("id") int id) {
        Contato contatoToRemove = null;
        for (Contato contato : contatos) {
            if (contato.getId() == id) {
                contatoToRemove = contato;
                break;
            }
        }
        if (contatoToRemove != null) {
            contatos.remove(contatoToRemove);
            return Response.status(Response.Status.OK).build();
        } else {
            throw new NotFoundException("Contato não encontrado");
        }
    }
}
