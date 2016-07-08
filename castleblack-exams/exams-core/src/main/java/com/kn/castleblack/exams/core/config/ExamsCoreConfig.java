package com.kn.castleblack.exams.core.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by kirshnachaitanya.gumma on 29/04/16.
 */

@Configuration
@ComponentScan({
        "com.kn.castleblack.exams.core.service"
})
@EnableJpaRepositories({
        "com.kn.castleblack.exams.core.repository"
})
@EntityScan({
        "com.kn.castleblack.exams.core.model"
})
public class ExamsCoreConfig {
}