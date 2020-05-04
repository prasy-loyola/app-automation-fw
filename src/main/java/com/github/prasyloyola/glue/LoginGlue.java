package com.github.prasyloyola.glue;

import io.cucumber.java.en.Given;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;

import javax.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Log4j
public class LoginGlue extends BaseGlue {


    public LoginGlue() {
        super();

    }

    @PostConstruct
    public void initDriver() {
        initBrowser();
    }

    @Given("I login to the UI")
    public void iLoginToTheUI() {
        log.info("url " + testConfiguration.getUrl());

        driver.get(testConfiguration.getUrl());
        throw new RuntimeException("test");
    }

    transient int s = 0;
    AtomicInteger sd = new AtomicInteger();

    public void init() {
        LinkedList<String> s = new LinkedList<>();
        s.add("d");

    }
}
