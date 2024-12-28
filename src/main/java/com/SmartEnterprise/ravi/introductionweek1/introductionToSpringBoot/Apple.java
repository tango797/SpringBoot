package com.SmartEnterprise.ravi.introductionweek1.introductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


//@Service
//@Repository
//this makes the Apple class as bean
//this notifies the spring framework that  the Apple is bean and obj can be instantiated
//@Component


@Scope("prototype")//means we can create different objects
// from a class which has diff hashcode
public class Apple {

    void eatingApple(){
        System.out.println("I am eating apple");
    }

    @PostConstruct
    //when bean is created it is called
    void callThisBeforeAppleIsUsed(){
        System.out.println("creating the apple");
    }

    @PreDestroy
    //when bean of this class destroy
    void callThisAfterDestorying(){
        System.out.println("destroy the beans apple class ");
    }
}
