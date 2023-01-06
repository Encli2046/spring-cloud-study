package com.encli.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author szq
 * @Date 2023/1/6 10:44
 */

@RestController
@Slf4j
public class StockController {

    @Value("${server.port}")
    private String port;


    @PostMapping("/stock/create")
    public String create(String parm) {
        log.info("parm={}", parm);
        return port + "-订单服务：订单创建成功,参数：" + parm;
    }

    @GetMapping("/stock/getInfo/{orderId}")
    public String getInfo(@PathVariable String orderId) {
        log.info("orderId={}", orderId);
        return port + "-订单服务：orderId=" + orderId;
    }

}
