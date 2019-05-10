package com.unisinsinght.eurekafeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.unisinsinght.eurekafeign.inter")
public class EurekafeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekafeignApplication.class, args);
    }

}
