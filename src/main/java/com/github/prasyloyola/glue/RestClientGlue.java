package com.github.prasyloyola.glue;

import com.github.prasyloyola.config.WebServiceConfiguration;
import com.github.prasyloyola.services.SeleniumService;
import io.cucumber.java.en.Given;
import lombok.extern.log4j.Log4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {WebServiceConfiguration.class, SeleniumService.class})
@ComponentScan(basePackages = "com.github.prasyloyola")
@DirtiesContext
@Log4j
public class RestClientGlue extends BaseGlue{



    @Given("I login to the application")
    public void iLoginToTheApplication() {
        log.info("rest client glue test");
        restClientService.sendRequest();
    }

}
