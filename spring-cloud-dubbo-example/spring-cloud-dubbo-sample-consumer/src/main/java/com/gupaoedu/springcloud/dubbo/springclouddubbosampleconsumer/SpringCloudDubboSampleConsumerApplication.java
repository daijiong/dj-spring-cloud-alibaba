package com.gupaoedu.springcloud.dubbo.springclouddubbosampleconsumer;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gupaoedu.springcloud.dubbo.ISayHelloService;

@RestController
@SpringBootApplication
public class SpringCloudDubboSampleConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDubboSampleConsumerApplication.class, args);
    }

    /**
     * 使用Reference注解引用dubbo的服务
     */
    @Reference
    ISayHelloService sayHelloService;

    @GetMapping("/say")
    public String say() {
        return sayHelloService.sayHello("Mic");
    }

}
