package com.kn.castleblack.exams.rest.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kirshnachaitanya.gumma on 29/04/16.
 */
@Configuration
@ComponentScan("com.kn.castleblack.exams.rest.resource")
@Slf4j
public class ExamsRestConfig {

    public ExamsRestConfig() {
        log.info("Initializing Exams Rest Spring Config");
    }
}
