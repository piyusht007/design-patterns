package com.piyush.creational.abstractfactory;

public class BrightWindow implements Window {
    public BrightWindow() {
        System.out.println("Bright Window");
    }

    public Window createWindow() {
        return new BrightWindow();
    }
}
