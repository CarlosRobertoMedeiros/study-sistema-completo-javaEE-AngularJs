package br.com.roberto;

import io.swagger.jaxrs.config.BeanConfig;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.logging.Logger;

//Continuar a partir dos 7 minutos do video
//https://synaptiklabs.com/posts/adding-swagger-to-a-javaee-project-javaee-series-2-part-2/
@ApplicationPath("/api")
public class SiscompApplication extends Application {

    //private static final String BASE_PATH = "siscomp-api";
    //private static final Logger LOGGER = Logger.getLogger(SiscompApplication.class.getName() );

    public SiscompApplication() {
        BeanConfig conf = new BeanConfig();
        conf.setTitle("SisComp - Api");
        conf.setDescription("SisComp - Sistema Completo");
        conf.setVersion("1.0.0");
        conf.setBasePath("/siscomp-api/api");
        conf.setResourcePackage("br.com.roberto.v1.rest");

        conf.setScan(true);
        conf.setPrettyPrint(true);

    }
}
