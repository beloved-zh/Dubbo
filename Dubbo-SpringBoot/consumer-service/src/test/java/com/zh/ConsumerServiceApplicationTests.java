package com.zh;

import com.zh.service.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@EnableDubbo
@SpringBootTest
class ConsumerServiceApplicationTests {

    @DubboReference(version = "1.0.0")
    private TestService testService;

    @Test
    void contextLoads() throws IOException {
        System.out.println("---------------------------");
        System.out.println(testService.test());
    }

}
