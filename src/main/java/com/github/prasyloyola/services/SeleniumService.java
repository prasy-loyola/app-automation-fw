package com.github.prasyloyola.services;

import com.github.prasyloyola.config.BrowserConfiguration;
import com.github.prasyloyola.config.TestConfiguration;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Service
@ComponentScan(basePackages = "com.github.prasyloyola")
@Scope(SCOPE_CUCUMBER_GLUE)
@Log4j
public class SeleniumService {

    @Autowired
    BrowserConfiguration browserConfiguration;

    @Getter
    @Setter

    WebDriver driver;

    @PostConstruct
    public void init() {
//        this.driver = new ChromeDriver();
        log.info("initializing seleniumservice");
    }


}
