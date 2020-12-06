package com.piyush.creational.abstractfactory;

/**
 * Factory implemented as enum singleton
 */
public enum DarkWidgetFactory implements WidgetFactory {
    INSTANCE;

    public Window createWindow() {
        System.out.println("DarkWidgetFactory#createWindow");
        return new DarkWindow();
    }

    public Button createButton() {
        System.out.println("DarkWidgetFactory#createButton");
        return new DarkButton();
    }
}
