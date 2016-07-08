package com.kn.castleblack.accounts.rest.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kirshnachaitanya.gumma on 29/04/16.
 */
@Configuration
@ComponentScan("com.kn.castleblack.accounts.rest.resource")
@Slf4j
public class AccountsRestConfig {

    public AccountsRestConfig() {
        log.info("Initializing Accounts Rest Spring Config");
    }
}
