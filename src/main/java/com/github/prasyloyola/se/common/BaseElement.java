package com.github.prasyloyola.se.common;

public abstract class BaseElement implements UIElement{

    @Override
    public boolean isDisplayed() {
        return getElement().isDisplayed();
    }

    @Override
    public boolean isEnabled() {
        return getElement().isEnabled();
    }


}
