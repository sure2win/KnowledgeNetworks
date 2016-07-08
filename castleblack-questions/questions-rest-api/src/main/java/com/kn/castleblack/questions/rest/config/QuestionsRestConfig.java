package com.kn.castleblack.questions.rest.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kirshnachaitanya.gumma on 29/04/16.
 */
@Configuration
@ComponentScan("com.kn.castleblack.questions.rest.resource")
@Slf4j
public class QuestionsRestConfig {

    public QuestionsRestConfig() {
        log.info("Initializing Questions Rest Spring Config");
    }
}
