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
public class OrderController {
    //调用支付订单服务端的ip+端口号
    public static final String provider_URL = "http://nacos-stock-service";

    @Autowired
    private RestTemplate restTemplate;

    //创建支付订单的接口
    @GetMapping("/consumer/create")
    public String create(String parm) {
        return restTemplate.postForObject(provider_URL + "/stock/create", parm, String.class);
    }

    //获取id获取支付订单
    @GetMapping("/consumer/getInfo/{orderId}")
    public String getprovider(@PathVariable("orderId") Long orderId) {
            return restTemplate.getForObject(provider_URL + "/stock/getInfo/" + orderId, String.class);
    }
}
