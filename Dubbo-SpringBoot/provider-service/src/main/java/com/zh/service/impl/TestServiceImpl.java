package com.zh.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zh.service.TestService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @author Beloved
 * @date 2020/9/6 14:14
 */
//@DubboService(weight = 1000)
@Service
public class TestServiceImpl implements TestService {

    @HystrixCommand // Hystrix接管容错异常
    @Override
    public String test() {
        // 模拟随机异常
        if (Math.random() > 0.5){
            throw new RuntimeException();
        }
        System.out.println("------------1------------");
        return "------------1------------";
    }
}
