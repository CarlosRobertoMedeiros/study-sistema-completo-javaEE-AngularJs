package br.com.roberto.rest;

import br.com.roberto.dto.ContatoDTO;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
@Path("/contatos")
public class ContatoRest {

    @GET
    @Produces(MediaType.APPLICATION_JSON )
    public Response getContatos(){

        List<ContatoDTO>  listaContatoDTO = new ArrayList<>();
        listaContatoDTO.add(new ContatoDTO(1L,"111.222.333-87","Carlos Roberto","61-9999-9999"));
        listaContatoDTO.add(new ContatoDTO(2L,"222.333.444-66","Antonio Nunes","61-8888-8888"));
        listaContatoDTO.add(new ContatoDTO(3L,"333.444.555-77","Luciene Alves","61-7777-7777"));

        return Response.ok(listaContatoDTO).build();

    }

}
