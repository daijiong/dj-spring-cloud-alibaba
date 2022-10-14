package com.gupaoedu.springboot.dubbo.springbootdubbosampleprovider.services;

import org.apache.dubbo.config.annotation.DubboService;

import com.gupaoedu.springboot.dubbo.ISayHelloService;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
// 使用DubboService注解来发布dubbo服务，registry指定哪个注册中心，version指定服务的版本号
@DubboService(registry = { "shanghai", "hunan" }, version = "2.0")
public class SayHelloServiceImpl2 implements ISayHelloService {

    @Override
    public String sayHello(String msg) {
        return "[Version2.0]Hello," + msg + " GuPaoEdu.cn";
    }
}
