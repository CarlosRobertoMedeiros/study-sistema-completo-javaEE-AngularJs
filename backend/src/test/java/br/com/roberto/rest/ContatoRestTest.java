package br.com.roberto.rest;

import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

//Olhar aqui https://www.devmedia.com.br/view/viewaula.php?idcomp=37932
//https://www.youtube.com/watch?v=Yko4DTEmAV8
public class ContatoRestTest {


    public static final String URL_BASE = "http://localhost:8086/br.com.roberto.backend-siscomp-api-1.0-SNAPSHOT";
    public static final String URL_VERSION = "/v1";
    public static final String URL_RESOURCE = "/contatos";

    public static final String URL_FULL_RESOURCE_CONTATOS = URL_BASE+URL_VERSION+URL_RESOURCE;


    @Test
    public void dado_urlValidaDeContatos_retorna_StatuscCode200paraJSON() {

        given()
            .header("Accept","application/json")
        .when()
            .get(URL_FULL_RESOURCE_CONTATOS+"?page=2")
        .then()
            .statusCode(HttpStatus.SC_OK)
            .body("data", is(notNullValue()));
    }

    @Test
    public void dado_urlValidaDeContatos_retorna_StatuscCode200paraXML() {

        given()
            .header("Accept","application/xml")
        .when()
            .get(URL_FULL_RESOURCE_CONTATOS+"?page=2")
        .then()
            .statusCode(HttpStatus.SC_OK)
            .body("data", is(notNullValue()));
    }

    /*
    @Test
    public void testListaContatos() {
        Response response  = given().contentType(ContentType.JSON)
            .when()
                .get(URL_RESOURCE_CONTATOS)
            .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .response();
        String jsonBody = response.getBody().asString();
        Assert.assertTrue(jsonBody.length()>0);
    }*/
}
