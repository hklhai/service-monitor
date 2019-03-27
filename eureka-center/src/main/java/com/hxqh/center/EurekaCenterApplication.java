package com.hxqh.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 启动一个服务注册中心
 * @author Lin
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCenterApplication.class, args);
    }

}
