package br.com.roberto;

import io.swagger.jaxrs.config.BeanConfig;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.logging.Logger;

@ApplicationPath("/api")
public class SiscompApplication extends Application {

    private static final String BASE_PATH = "siscomp-api";
    private static final Logger LOGGER = Logger.getLogger(SiscompApplication.class.getName() );

    public SiscompApplication() {
        BeanConfig conf = new BeanConfig();
        conf.setTitle("SisComp - Api");
        conf.setDescription("SisComp - Sistema Completo");
        conf.setVersion("1.0.0");
        conf.setBasePath(BASE_PATH);
        conf.setResourcePackage("br.com.roberto");
        conf.setScan(true);
        conf.setPrettyPrint(true);
    }
}
