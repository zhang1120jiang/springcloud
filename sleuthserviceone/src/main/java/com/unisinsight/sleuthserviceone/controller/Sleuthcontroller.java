package com.unisinsight.sleuthserviceone.controller;

import com.unisinsight.sleuthserviceone.service.Sservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sleuthcontroller {

    @Autowired
    private Sservice service;

    @GetMapping("hi")
    public String sayHi(@RequestParam String name){
        return service.sayHi(name);
    }
}
