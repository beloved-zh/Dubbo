package com.zh.service.impl;

import com.zh.service.DemoService;

/**
 * @author Beloved
 * @date 2020/9/5 14:27
 */
public class DemoServiceImplNew implements DemoService {

    public String demo(String name) {
        System.out.println("----------new---------");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "传递过来的name"+name;
    }
}
