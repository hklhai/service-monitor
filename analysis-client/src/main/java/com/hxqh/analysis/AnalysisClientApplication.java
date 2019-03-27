package com.hxqh.analysis;

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
public class AnalysisClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnalysisClientApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        System.out.println("AnalysisClient");
        return "hi " + name + ",i am AnalysisClient from port:" + port;
    }


}
