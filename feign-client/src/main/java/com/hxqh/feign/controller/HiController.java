package com.hxqh.feign.controller;

import com.hxqh.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ocean lin on 2019/3/27.
 *
 * @author Ocean lin
 */
@RestController
public class HiController {

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return feignService.sayHiFromClientOne(name);
    }

}
