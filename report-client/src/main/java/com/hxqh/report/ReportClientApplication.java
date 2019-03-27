package com.hxqh.report;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通过注解@EnableEurekaClient 表明自己是一个eurekaclient.
 *
 * @author Lin
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ReportClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReportClientApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        System.out.println("ReportClient");
        return "hi " + name + ",i am ReportClient from and port:" + port;
    }

}
