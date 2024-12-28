package com.SmartEnterprise.ravi.introductionweek1.introductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@ConditionalOnProperty(name = "deploy.env", havingValue = "Development")
//load this when matched with application properties check application.properties
public class DevDb implements DB {


    @Override
    public String getDbData() {
        return "Dev Data";
    }
}
