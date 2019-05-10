package com.unisinsinght.eurekafeign.inter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FeignClient:调用对应服务名的服务
 *
 */
@FeignClient("eurekaclient")
public interface FeignInter {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHi(@RequestParam("name") String name);
}
