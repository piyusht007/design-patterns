package com.piyush.creational.abstractfactory;

public enum BrightWidgetFactory implements WidgetFactory {
    INSTANCE;

    public Window createWindow() {
        return new BrightWindow();
    }

    public Button createButton() {
        return new BrightButton();
    }
}
