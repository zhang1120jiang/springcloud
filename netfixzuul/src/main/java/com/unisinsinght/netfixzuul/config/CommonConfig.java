package com.unisinsinght.netfixzuul.config;

import com.unisinsinght.netfixzuul.filter.AccessFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfig {

    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }
}
