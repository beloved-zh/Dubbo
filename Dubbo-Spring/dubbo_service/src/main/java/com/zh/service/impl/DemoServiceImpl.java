package com.zh.service.impl;

import com.zh.service.DemoService;

/**
 * @author Beloved
 * @date 2020/9/7 23:18
 */
public class DemoServiceImpl implements DemoService {

    private final DemoService demoService;

    /**
     * 传入DemoService远程代理对象
     * @param demoService
     */
    public DemoServiceImpl(DemoService demoService){
        super();
        this.demoService = demoService;
    }

    /**
     * 可以在调用服务做一些判断是调用远程实现还是本地实现
     * @param name
     * @return
     */
    public String demo(String name) {

        if (name == null){
            return demoService.demo(name);
        }
        return "我是本地存根";
    }
}
