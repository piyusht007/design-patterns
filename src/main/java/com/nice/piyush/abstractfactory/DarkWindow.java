package com.nice.piyush.abstractfactory;

public class DarkWindow implements Window {
    public DarkWindow() {
        System.out.println("Dark Product");
    }

    public Window createWindow() {
        return new DarkWindow();
    }
}
