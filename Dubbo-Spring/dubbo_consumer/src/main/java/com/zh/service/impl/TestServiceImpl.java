package com.zh.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zh.service.DemoService;
import com.zh.service.TestService;

/**
 * @author Beloved
 * @date 2020/9/5 16:42
 */
public class TestServiceImpl implements TestService {

    @Reference
    private DemoService demoService;

    public void test() {
        // 调用Provider中提供的方法
        String name = demoService.demo("张三");
        System.out.println(name);
    }
}
