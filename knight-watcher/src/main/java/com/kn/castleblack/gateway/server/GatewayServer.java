package com.kn.castleblack.gateway.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by kirshnachaitanya.gumma on 27/04/16.
 */
@SpringBootApplication(scanBasePackages = {"com.kn.gateway.knightwatcher.**.config"})
@EnableZuulProxy
public class GatewayServer implements HealthIndicator{

    public static void main(String args[])
    {
        SpringApplication.run(GatewayServer.class,args);
    }

    @Override
    public Health health() {
        return Health.up().withDetail("STATUS", "SUCCESS").build();
    }
}
