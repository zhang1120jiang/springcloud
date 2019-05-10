package com.unisinsinght.hystrixribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "sayHiFallBack")
    public String sayHi(String name){
        return restTemplate.getForObject("http://eurekaclient/hi?name="+name,String.class);
    }

    public String sayHiFallBack(String name){
        return "error";
    }
}
