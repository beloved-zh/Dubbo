package com.zh;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = "classpath:applicationContext-dubbo.xml")
@EnableDubbo
@EnableHystrix //开启服务容错
@SpringBootApplication
public class ProviderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderServiceApplication.class, args);
	}

}
