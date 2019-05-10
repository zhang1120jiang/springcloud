package com.unisinsight.eurekaclient.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * eureka客户端
 */
@EnableEurekaClient
@RestController("client")
public class EurekaClient {

    @Value("${server.port}")
    private String port;

    @GetMapping("hi")
    public String getStr(@RequestParam String name){
        return name+"port："+port;

    }
}
