package com.SmartEnterprise.ravi.introductionweek1.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DbService {

//    @Autowired
//    DevDb db;//db service are tightly coupled to get the dev db only .
    // if we change dev to prod then we can access prod data

//    @Autowired
    DB db;
    //construction injection
    public DbService(DB db){
        this.db= db;
    }

     public String getDbData(){
      return db.getDbData();
    }
}
