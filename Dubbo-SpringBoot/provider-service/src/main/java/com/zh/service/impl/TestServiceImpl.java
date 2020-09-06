package com.zh.service.impl;

import com.zh.service.TestService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @author Beloved
 * @date 2020/9/6 14:14
 */
@DubboService
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test() {
        return "我是一个测试服务";
    }
}
