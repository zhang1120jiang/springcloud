package com.unisinsight.hystrixfeign.controller;

import com.unisinsight.hystrixfeign.service.HiSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private HiSerivce hiSerivce;

    @RequestMapping
    public String sayHi(@RequestParam String name){
        return hiSerivce.sayHi(name);
    }

}
