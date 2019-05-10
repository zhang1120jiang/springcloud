package com.unisinsight.hystrixfeign.service;

import com.unisinsight.hystrixfeign.service.fallBack.HiSerivceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * fallback：用于服务降级使用，这里已经集成了Hystrix(断路器)
 */
@FeignClient(name = "eurekaclient" , fallback = HiSerivceFallBack.class)
public interface HiSerivce {

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam("name") String name);

}
