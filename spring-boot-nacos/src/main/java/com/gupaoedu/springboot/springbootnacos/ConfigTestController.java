package com.gupaoedu.springboot.springbootnacos;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 *
 * @author daijiong
 * @version : ConfigController.java, v 0.1 2021/3/31 0:00 daijiong Exp $$
 */
@NacosPropertySource(dataId = "springboot-nacos", autoRefreshed = true)
@RestController
public class ConfigTestController {

    @NacosValue(value = "${info:Hello World}", autoRefreshed = true)
    private String info;

    @GetMapping("/get-info")
    public String get() {
        return info;
    }
}
