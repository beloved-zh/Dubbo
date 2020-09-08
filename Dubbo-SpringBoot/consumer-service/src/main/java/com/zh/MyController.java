package com.zh;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zh.service.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Beloved
 * @date 2020/9/8 9:34
 */
@RestController
public class MyController {


    @DubboReference(loadbalance="roundrobin")
    private TestService testService;


    @HystrixCommand(fallbackMethod = "errro")
    @GetMapping("/")
    public String index(){
        return testService.test();
    }

    @GetMapping("/errro")
    public String errro(){
        return "服务出现异常，已被Hystrix接管";
    }
}
