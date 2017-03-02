package com.kn.castleblack.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by kirshnachaitanya.gumma on 27/04/16.
 */
@EnableEurekaServer
@SpringBootApplication(scanBasePackages = {"com.kn.castleblack.eureka.**.config"})
public class EurekaServer implements HealthIndicator{

    public static void main(String args[])
    {
        SpringApplication.run(EurekaServer.class,args);
    }

    @Override
    public Health health() {
        return Health.up().withDetail("STATUS", "SUCCESS").build();
    }
}
