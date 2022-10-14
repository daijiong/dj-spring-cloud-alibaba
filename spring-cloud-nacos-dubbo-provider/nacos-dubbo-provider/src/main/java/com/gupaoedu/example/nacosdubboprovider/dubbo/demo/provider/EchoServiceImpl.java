
package com.gupaoedu.example.nacosdubboprovider.dubbo.demo.provider;

import com.gupaoedu.example.api.EchoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;

@RefreshScope
@Service(protocol = "dubbo")
class EchoServiceImpl implements EchoService {
    //Environement(PropertySource)
    // application.properties
    @Value("${project.name}")
    private String name;

    @Autowired
    private Environment environment;

    //Environment
    //  配置来源  PropertySource
    //  远程配置一定是会作为PropertySource 解析并保存到Environemnt
    //  远程配置的优先级?
    @Override
    public String echo(String message) {
        return "[" + name + "] Hello, " + message;
    }

}
