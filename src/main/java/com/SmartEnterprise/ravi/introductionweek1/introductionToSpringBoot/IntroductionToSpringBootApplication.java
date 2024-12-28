package com.SmartEnterprise.ravi.introductionweek1.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {
    @Autowired
    // @Autowired tell the SpringBoot application that this bean is dependency need to be injected
    //These are sigleton beans
    Apple obj;
    @Autowired
    Apple apple;
    @Autowired
    DbService dbService;


    public static void main(String[] args) {
        SpringApplication.run(IntroductionToSpringBootApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {
        obj.eatingApple();
        apple.eatingApple();
        System.out.println(obj.hashCode());
        System.out.println(apple.hashCode());

        System.out.println(dbService.getDbData());

    }
}
