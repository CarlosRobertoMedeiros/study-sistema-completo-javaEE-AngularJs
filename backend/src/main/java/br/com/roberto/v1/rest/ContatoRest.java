package br.com.roberto.v1.rest;

import br.com.roberto.v1.model.ContatoModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
@Path("v1/contatos")
@Api("Contato")
public class ContatoRest {


    @ApiOperation(value = "Consultar por CPF ou CNPJ", notes = "Operação responsável em consultar um cliente por CPF ou CNPJ.",
            response = ContatoModel.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Sucesso", response = ContatoModel.class),
            @ApiResponse(code = 400, message = "Requisição inválida."),
            @ApiResponse(code = 401, message = "Não Autorizado."),
            @ApiResponse(code = 403, message = "Sem prefil para executar a operação"),
            @ApiResponse(code = 412, message = "Erro Negócio"),
            @ApiResponse(code = 500, message = "Internal Server Error.")})

    @GET
    @Produces(MediaType.APPLICATION_JSON )
    public Response getContatos(){

        List<ContatoModel>  listaContatoDTO = new ArrayList<>();
        listaContatoDTO.add(new ContatoModel(1L,"111.222.333-87","Carlos Roberto","61-9999-9999"));
        listaContatoDTO.add(new ContatoModel(2L,"222.333.444-66","Antonio Nunes","61-8888-8888"));
        listaContatoDTO.add(new ContatoModel(3L,"333.444.555-77","Luciene Alves","61-7777-7777"));

        return Response.ok(listaContatoDTO).build();

    }

}
