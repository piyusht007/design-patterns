package com.piyush.abstractfactory;

public class BrightWindow implements Window {
    public BrightWindow() {
        System.out.println("Bright Product");
    }

    public Window createWindow() {
        return new BrightWindow();
    }
}
