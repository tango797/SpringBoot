package com.SmartEnterprise.ravi.introductionweek1.introductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="deploy.env" , havingValue = "Production")
public class ProdDb implements DB {

    @Override
    public String getDbData() {
        return "Prod Data";
    }
}
