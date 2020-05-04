package com.github.prasyloyola;

import com.github.prasyloyola.glue.hooks.CucumberEventListener;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features", plugin = {"com.github.prasyloyola.glue.hooks.CucumberEventListener"})
public class TestRunner {
}
