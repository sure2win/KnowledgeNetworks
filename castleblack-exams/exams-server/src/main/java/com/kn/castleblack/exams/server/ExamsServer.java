package com.kn.castleblack.exams.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by kirshnachaitanya.gumma on 27/04/16.
 */
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = {"com.kn.castleblack.**.config"})
public class ExamsServer implements HealthIndicator {

    public static void main(String args[])
    {
        SpringApplication.run(ExamsServer.class,args);
    }

    @Override
    public Health health() {
        return Health.up().withDetail("STATUS", "SUCCESS").build();
    }
}
