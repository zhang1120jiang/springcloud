package com.unisinsight.hystrixfeign.service.fallBack;

import com.unisinsight.hystrixfeign.service.HiSerivce;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用于服务降级
 */
@Component
public class HiSerivceFallBack  implements HiSerivce {


    @Override
    public String sayHi(@RequestParam("name") String name) {
        return "error";
    }
}
