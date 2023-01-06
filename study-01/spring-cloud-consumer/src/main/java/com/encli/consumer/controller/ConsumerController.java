package com.encli.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author szq
 * @Date 2023/1/6 10:44
 */

@RestController
@Slf4j
public class ConsumerController {
    //调用支付订单服务端的ip+端口号
    public static final String provider_URL = "http://service-provider";

    @Autowired
    private RestTemplate restTemplate;

    //创建支付订单的接口
    @GetMapping("/consumer/provider/create")
    public String create(String parm) {
        return restTemplate.postForObject(provider_URL + "/provider/create", parm, String.class);
    }

    //获取id获取支付订单
    @GetMapping("/consumer/provider/get/{id}")
    public String getprovider(@PathVariable("id") Long id) {
            return restTemplate.getForObject(provider_URL + "/provider/get/" + id, String.class);
    }
}
