package com.github.prasyloyola.glue;

import com.github.prasyloyola.config.BrowserConfiguration;
import com.github.prasyloyola.config.TestConfiguration;
import com.github.prasyloyola.config.WebServiceConfiguration;
import com.github.prasyloyola.services.RestClientService;
import com.github.prasyloyola.services.SeleniumService;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.PostConstruct;


public abstract class BaseGlue {



    @Autowired
    SeleniumService seleniumService;

    WebDriver driver;
    @Autowired
    RestClientService restClientService;

    @Autowired
    ApplicationContext context;

    @Autowired
    TestConfiguration testConfiguration;

    @Autowired
    BrowserConfiguration browserConfiguration;
    public BaseGlue(){

    }

    @PostConstruct
    public void init(){

    }

protected void initBrowser(){
        this.driver = browserConfiguration.getDriver();
}
}
