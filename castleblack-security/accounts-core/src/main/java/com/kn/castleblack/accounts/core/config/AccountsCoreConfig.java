package com.kn.castleblack.accounts.core.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by kirshnachaitanya.gumma on 29/04/16.
 */

@Configuration
@ComponentScan({
        "com.kn.castleblack.accounts.core.service","com.kn.castleblack.accounts.core.model"
})
@EnableJpaRepositories({
        "com.kn.castleblack.accounts.core.repository"
})
@EntityScan({"com.kn.castleblack.accounts.core.model"})
public class AccountsCoreConfig {
}