package com.github.prasyloyola.config;

import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource(value = "cuckoo.properties", ignoreResourceNotFound = true)
@ComponentScan(basePackages = "com.github.prasyloyola")
@Data
public class TestConfiguration {
@Value("${app.url}")
String url;

}
