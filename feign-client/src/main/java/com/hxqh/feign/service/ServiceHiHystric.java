package com.hxqh.feign.service;

import org.springframework.stereotype.Component;

/**
 * Created by Ocean lin on 2019/3/28.
 * <p>
 * 新建ServiceHiHystric作为快速失败处理类，必须实现FeignService接口，并注入到Ioc容器。
 *
 * @author Ocean lin
 */
@Component
public class ServiceHiHystric implements FeignService {
    @Override
    public String sayHiFromClientOne(String name) {
        // todo 存储 改造FeignService，添加快速失败处理逻辑类ServiceHiHystric
        return "sorry " + name;
    }
}
