package com.piyush.creational.abstractfactory;

/**
 * Factory implemented as enum singleton
 */
public enum BrightWidgetFactory implements WidgetFactory {
    INSTANCE;

    public Window createWindow() {
        System.out.println("BrightWidgetFactory#createWindow");
        return new BrightWindow();
    }

    public Button createButton() {
        System.out.println("BrightWidgetFactory#createButton");
        return new BrightButton();
    }
}
