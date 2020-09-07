package com.zh;

import com.zh.service.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class ConsumerServiceApplicationTests {

    @DubboReference
    private TestService testService;

    @Test
    void contextLoads() throws IOException {

        String test = testService.test();

        System.out.println(test);

        System.in.read();
    }

}
