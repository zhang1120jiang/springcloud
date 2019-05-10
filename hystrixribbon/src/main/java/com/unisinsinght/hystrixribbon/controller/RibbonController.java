package com.unisinsinght.hystrixribbon.controller;

import com.unisinsinght.hystrixribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @RequestMapping("hi")
    public String sayHi(@RequestParam String name){
        return ribbonService.sayHi(name);
    }
}
