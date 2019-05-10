package com.unisinsinght.eurekaribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String  getHi(String name){
       return restTemplate.getForObject("http://EUREKACLIENT/hi?name="+name,String.class);
    }
}
