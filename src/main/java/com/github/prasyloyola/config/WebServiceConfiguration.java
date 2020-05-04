package com.github.prasyloyola.config;

import lombok.Data;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;


//@PropertySource(value = "cuckoo.properties")
@ComponentScan(basePackages = "com.github.prasyloyola")
@Data
@Log4j
public class WebServiceConfiguration {

    @Value("${ws.timeout:0}")
    private long timeout;


    @PostConstruct
    public void init() {
        log.info("test-initing");
        log.info(timeout);
    }
}

