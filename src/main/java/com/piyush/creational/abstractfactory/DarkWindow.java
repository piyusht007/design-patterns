package com.piyush.creational.abstractfactory;

public class DarkWindow implements Window {
    public DarkWindow() {
        System.out.println("Dark Window");
    }

    public Window createWindow() {
        return new DarkWindow();
    }
}
