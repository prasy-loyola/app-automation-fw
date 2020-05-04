package com.github.prasyloyola.se.common;

import org.openqa.selenium.WebElement;

import java.util.List;

public interface UIElement {

    boolean isDisplayed();
    boolean isEnabled();
    String getValue();
    String getColor();
    String getSelected();
    void setValue(String option);
    WebElement getElement();
    List<String> getOptions();
    void verifyIfElementIsOfType();
}
