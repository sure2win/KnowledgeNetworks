package com.kn.castleblack.gateway.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.annotation.Retryable;

/**
 * Created by kirshnachaitanya.gumma on 27/04/16.
 */
@SpringBootApplication(scanBasePackages = {"com.kn.castleblack.gateway.**.config"})
@EnableZuulProxy
@EnableEurekaClient
@EnableRetry
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
