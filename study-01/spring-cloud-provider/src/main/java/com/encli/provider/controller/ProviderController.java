package com.encli.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author szq
 * @Date 2023/1/6 12:00
 */
@RestController
@Slf4j
public class ProviderController {

    @Value("${server.port}")
    private String port;
    @Value("${spring.profiles.active}")
    private String active;


    @PostMapping("/provider/create")
    public String create(String parm) {
        log.info("parm={}", parm);
        return "提供者create=OK," + parm;
    }

    @GetMapping("/provider/get/{id}")
    public String get(@PathVariable String id) {
        log.info("id={}", id);
        return "提供者：id=" + id + "；port:" + port+ "；active:" + active;
    }


}
