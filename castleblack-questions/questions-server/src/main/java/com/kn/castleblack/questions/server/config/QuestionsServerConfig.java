package com.kn.castleblack.questions.server.config;

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
public class QuestionsServerConfig extends ResourceConfig {

    private static final String QUESTIONS_PACKAGE_NAME = "com.kn.castleblack.questions.rest.resource";

    public QuestionsServerConfig() {
        log.info("Initializing Questions Rest Resources located at " + QUESTIONS_PACKAGE_NAME);
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        //register(AbstractRestResource.class);
        packages(true, QUESTIONS_PACKAGE_NAME);
    }
}
