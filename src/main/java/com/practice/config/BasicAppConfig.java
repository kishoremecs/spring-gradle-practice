package com.practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasicAppConfig {

    @Bean
    public String basicAppName() {
        return "Hello World App in Gradle";
    }


}
