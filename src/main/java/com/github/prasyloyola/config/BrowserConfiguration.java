package com.github.prasyloyola.config;

import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;

import java.util.List;
import java.util.Map;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Configuration
@PropertySource(value = "cuckoo.properties", ignoreResourceNotFound = true)
@ComponentScan(basePackages = "com.github.prasyloyola")
@ConfigurationProperties(prefix = "selenium")
@Data
public class BrowserConfiguration {
    String browser;
    String options;

    @Bean(value = "browser", autowireCandidate = false)
    @Scope(SCOPE_CUCUMBER_GLUE)
    public WebDriver getDriver() {
        return new ChromeDriver();
    }

}
