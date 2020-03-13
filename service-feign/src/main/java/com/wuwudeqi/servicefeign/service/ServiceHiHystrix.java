package com.wuwudeqi.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceHiHystrix implements ServiceHi {
    @Override
    public String sayHiFromServiceHi(String name) {
        return "hello" + name +", this message send failed";
    }
}
