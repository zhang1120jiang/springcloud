package com.unisinsinght.eurekafeign.controller;

import com.unisinsinght.eurekafeign.inter.FeignInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private FeignInter feignInter;

    @GetMapping("hi")
    public String getStr(@RequestParam String name){
        return feignInter.sayHi(name);
    }
}
