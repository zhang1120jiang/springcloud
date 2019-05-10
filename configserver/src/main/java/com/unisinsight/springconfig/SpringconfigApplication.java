package com.unisinsight.springconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * config：配置中心服务端
 * EnableConfigServer:开启配置中心服务端
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class SpringconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringconfigApplication.class, args);
    }

}
