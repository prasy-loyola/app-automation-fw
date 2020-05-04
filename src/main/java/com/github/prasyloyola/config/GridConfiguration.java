package com.github.prasyloyola.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "cuckoo.properties", ignoreResourceNotFound = true)
@ComponentScan(basePackages = "com.github.prasyloyola")
@ConfigurationProperties(prefix = "selenium.grid")
@Data
public class GridConfiguration {
    String url;
    String host;
}
