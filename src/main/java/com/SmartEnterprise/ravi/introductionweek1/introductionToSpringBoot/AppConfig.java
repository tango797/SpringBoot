package com.SmartEnterprise.ravi.introductionweek1.introductionToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class AppConfig {
    @Scope("prototype")
    @Bean

    Apple getApple() {
        return new Apple();
    }
}
