package com.zh.config;

import com.zh.service.TestService;
import com.zh.service.impl.TestServiceImpl;
import org.apache.dubbo.config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Beloved
 * @date 2020/9/8 8:42
 */
@Configuration
public class DubboConfig {

    /*
     * 可参考dubbo的xml配置文件
     * 每一个标签对应一个xxxConfig
     */

    // 应用配置
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig application = new ApplicationConfig();
        application.setName("provider-service");
        return application;
    }

    // 连接注册中心配置
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registry = new RegistryConfig();
        registry.setProtocol("zookeeper");
        registry.setAddress("120.55.45.177:2181");
        registry.setCheck(false);
        return registry;
    }

    // 服务提供者协议配置
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocol = new ProtocolConfig();
        protocol.setName("dubbo");
        protocol.setPort(20881);
        return protocol;
    }

    // 服务提供者暴露服务配置
    @Bean
    public ServiceConfig<TestService> testServiceConfig(TestService testService){

        ServiceConfig<TestService> config = new ServiceConfig<>();
        // 使用全限定类名或对象任意一种即可
//        config.setInterface("com.zh.service.impl.TestServiceImpl");
        config.setInterface(TestService.class);
        config.setRef(testService);
//        config.setVersion("1.0.0");
//        config.setWeight(500);


        //配置每一个method信息
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("test");
        methodConfig.setTimeout(5000);

        List<MethodConfig> methods = new ArrayList<>();
        methods.add(methodConfig);
        // 将method配置在ServiceConfig中
        config.setMethods(methods);

        return config;
    }

    // ProviderConfig
    // MonitorConfig
}
