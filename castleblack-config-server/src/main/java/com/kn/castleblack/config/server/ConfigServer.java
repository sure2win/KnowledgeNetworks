package com.kn.castleblack.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by kirshnachaitanya.gumma on 13/07/16.
 */

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServer implements HealthIndicator{

    public static void main(String args[])
    {
        SpringApplication.run(ConfigServer.class,args);
    }

    @Override
    public Health health() {
        return Health.up().withDetail("STATUS", "SUCCESS").build();
    }
}