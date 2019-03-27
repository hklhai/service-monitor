package com.hxqh.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Ocean lin on 2019/3/27.
 *
 * @author Ocean lin
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    public String helloService(String name) {
        return restTemplate.getForObject("http://SERVICE-ANALYSIS/hi?name=" + name, String.class);
    }

}
