package com.hxqh.ribbon.controller;

import com.hxqh.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ocean lin on 2019/3/27.
 *
 * @author Ocean lin
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.helloService(name);
    }

}
