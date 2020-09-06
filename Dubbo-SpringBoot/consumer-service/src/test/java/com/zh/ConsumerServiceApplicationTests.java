package com.zh;

import com.zh.service.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerServiceApplicationTests {

    @DubboReference
    private TestService testService;

    @Test
    void contextLoads() {

        String test = testService.test();

        System.out.println(test);

    }

}
