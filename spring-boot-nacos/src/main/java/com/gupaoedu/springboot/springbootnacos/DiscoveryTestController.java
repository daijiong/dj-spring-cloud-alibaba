package com.gupaoedu.springboot.springbootnacos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2082233439
 * http://www.gupaoedu.com
 **/
@RestController
public class DiscoveryTestController {

    /** 服务注册功能的Service */
    @NacosInjected
    private NamingService namingService;

    @GetMapping("/get-instances")
    public String get() throws NacosException {
        return namingService.getAllInstances("springboot-nacos").toString();
    }

    @GetMapping("/registry-test")
    public String registry() throws NacosException {
        // 创建一个实例
        Instance instance = new Instance();
        instance.setClusterName("TestCluster");
        instance.setEnabled(true);
        //临时/持久化节点：true-临时节点，CP（Raft）；false-持久化节点，AP（Distro）
        instance.setEphemeral(true);
        instance.setIp("192.168.1.104");
        instance.setPort(8888);
        //权重：从1~100，数字越大表示权重越大
        instance.setWeight(10);
        namingService.registerInstance("springboot-nacos", instance);
        return "SUCCESS";
    }

}
