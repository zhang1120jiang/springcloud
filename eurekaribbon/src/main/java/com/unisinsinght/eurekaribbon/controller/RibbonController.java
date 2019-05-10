package com.unisinsinght.eurekaribbon.controller;

import com.unisinsinght.eurekaribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("hi")
    private String getHi(@RequestParam String name){

        return ribbonService.getHi(name);
    }
}
