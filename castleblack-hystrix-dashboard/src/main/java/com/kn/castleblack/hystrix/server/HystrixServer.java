package com.kn.castleblack.hystrix.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by kirshnachaitanya.gumma on 27/04/16.
 */

@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = {"com.kn.castleblack.gateway.**.config"})
public class HystrixServer implements HealthIndicator{

    public static void main(String args[])
    {
        SpringApplication.run(HystrixServer.class,args);
    }

    @Override
    public Health health() {
        return Health.up().withDetail("STATUS", "SUCCESS").build();
    }
}
