package com.unisinsight.sleuthserviceone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sleuthcontroller {


    @GetMapping("two")
    public String sayHi(@RequestParam String name){
        return name;
    }
}
