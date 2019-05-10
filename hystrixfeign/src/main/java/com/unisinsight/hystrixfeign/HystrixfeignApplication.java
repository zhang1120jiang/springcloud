package com.unisinsight.hystrixfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.unisinsight.hystrixfeign.service"})
@EnableEurekaClient
@EnableDiscoveryClient
public class HystrixfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixfeignApplication.class, args);
    }

}
