package com.encli.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 动态获取nacos配置
 * @Author szq
 * @Date 2023/1/6 14:47
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class TestNacosConfigController {

    @Value("${testConfig.name}")
    private String name;
    @Value("${spring.datasource.url}")
    private String url;

    @RequestMapping("/get")
    public String get() {
        return "name：" + name;
    }

    @RequestMapping("/getUrl")
    public String getUrl() {
        return "spring.datasource.url：" + url;
    }
}