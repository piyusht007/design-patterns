package com.piyush.creational.abstractfactory;

public enum DarkWidgetFactory implements WidgetFactory {
    INSTANCE;

    public Window createWindow() {
        return new DarkWindow();
    }

    public Button createButton() {
        return new DarkButton();
    }
}