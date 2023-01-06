package com.encli.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author szq
 * @Date 2023/1/6 14:47
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${testConfig.val01}")
    private String val01;

    @RequestMapping("/get")
    public String get() {
        return val01;
    }
}