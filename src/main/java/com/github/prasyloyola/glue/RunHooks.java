package com.github.prasyloyola.glue;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.extern.log4j.Log4j;

@Log4j
public class RunHooks {
    @Before
    public void before(Scenario scenario){
        log.info("before "+scenario.getUri());
        log.info("before "+scenario.getId());
        log.info("before "+scenario.getLine());
//        throw new RuntimeException("");
    }
    @After
    public void after(Scenario scenario){

    }
}
