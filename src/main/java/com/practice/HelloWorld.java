package com.practice;

import java.time.LocalTime;

import com.practice.config.BasicAppConfig;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

        ApplicationContext ctx = new AnnotationConfigApplicationContext(BasicAppConfig.class);
        String appName = (String) ctx.getBean("basicAppName");
        System.out.println(appName);


    }
}