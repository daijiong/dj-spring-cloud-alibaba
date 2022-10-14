package com.gupaoedu.springcloud.dubbo.springclouddubbosampleprovider.services;

import org.apache.dubbo.config.annotation.Service;

import com.gupaoedu.springcloud.dubbo.ISayHelloService;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
// 注意：这里的注解是dubbo的，不是spring的
@Service
public class SayHelloServiceImpl implements ISayHelloService {

    @Override
    public String sayHello(String msg) {
        return "Hello, GuPaoEdu.cn";
    }
}
