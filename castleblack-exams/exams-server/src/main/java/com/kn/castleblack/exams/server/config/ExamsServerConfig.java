package com.kn.castleblack.exams.server.config;

import lombok.extern.slf4j.Slf4j;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Created by kirshnachaitanya.gumma on 27/04/16.
 */
@ApplicationPath("/knowledge")
@Slf4j
@Component
public class ExamsServerConfig extends ResourceConfig {

    private static final String EXAMS_PACKAGE_NAME = "com.kn.castleblack.exams.rest.resource";

    public ExamsServerConfig() {
        log.info("Initializing exams Rest Resources located at " + EXAMS_PACKAGE_NAME);
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        //register(AbstractRestResource.class);
        packages(true, EXAMS_PACKAGE_NAME);
    }
}
