package com.gupaoedu.dubbo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gupaoedu.dubbo.server.ILoginService;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ILoginService loginService = null;
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/application.xml");
        loginService = context.getBean(ILoginService.class);
        String result = loginService.login("admin", "admin");
        System.out.println(result);
    }
}
