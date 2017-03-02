package com.kn.castleblack.security.server.config;

import lombok.extern.slf4j.Slf4j;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Created by kirshnachaitanya.gumma on 27/04/16.
 */
@Slf4j
@Component
public class SecurityServerConfig extends ResourceConfig {

    private static final String ACCOUNTS_PACKAGE_NAME = "com.kn.castleblack.accounts.rest.resource";

    public SecurityServerConfig() {
        log.info("Initializing Security Rest Resources located at " + ACCOUNTS_PACKAGE_NAME);
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        //register(AccountResource.class);
        //register(AbstractRestResource.class);
        packages(true, ACCOUNTS_PACKAGE_NAME);
    }
}
