package com.leigq.www.server;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.leigq.www.dubbo.model.mapper")
//@ImportResource(value = {"classpath:dubbo/spring-dubbo.xml"})//此配置文件已废弃，本项目已采用注解方式配置
@DubboComponentScan({"com.leigq.www.server.service.dubbo", "com.leigq.www.server.controller"})
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

}
