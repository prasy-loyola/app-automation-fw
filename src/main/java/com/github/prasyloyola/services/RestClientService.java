package com.github.prasyloyola.services;

import com.github.prasyloyola.config.WebServiceConfiguration;
import lombok.extern.log4j.Log4j;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j
public class RestClientService {

    @Autowired
    WebServiceConfiguration configuration;

    public void sendRequest(){
        log.info(configuration.getTimeout());

        Assert.assertEquals(configuration.getTimeout(),60);
    }
}
