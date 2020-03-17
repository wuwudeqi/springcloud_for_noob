package com.wuwudeqi.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RefreshScope
public class HelloController {
    @Value("${config.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        new HashMap<>();
        return this.hello;
    }
}