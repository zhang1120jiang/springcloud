package com.unisinsight.sleuthserviceone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Sservice {

    @Autowired
    private RestTemplate restTemplate;

    public String sayHi(String name){
      return  restTemplate.getForObject("http://service-two/two?name="+name,String.class);
    }
}
