package com.gupaoedu.springcloudnacosdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 *
 * @author daijiong
 * @version : ConfigController.java, v 0.1 2021/3/30 22:10 daijiong Exp $$
 */
// spring的注解，表示当前类中的属性，需要动态刷新
@RefreshScope
@RestController
public class ConfigController {

    @Value("${info:hell world}")
    private String info;

    @GetMapping("/get")
    public String get() {
        return info;
    }
}
