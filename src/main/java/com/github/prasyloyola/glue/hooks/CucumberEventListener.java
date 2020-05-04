package com.github.prasyloyola.glue.hooks;

import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.*;
import lombok.extern.log4j.Log4j;

@Log4j
public class CucumberEventListener implements ConcurrentEventListener {
    @Override
    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(TestCaseFinished.class, this::handleTestCaseFinished);
    }


    private void handleTestCaseFinished(TestCaseFinished event) {
        TestCase testCase = event.getTestCase();
        Result result = event.getResult();
        Status status = result.getStatus();
        Throwable error = result.getError();
        String scenarioName = testCase.getName();
        String id = "" + testCase.getUri() + testCase.getLine();
        log.info("Testcase " + scenarioName + " - " + status.name());
        if(error != null){
            log.error(error.getMessage(), error);
        }


    }
}
