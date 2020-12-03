package com.piyush.creational.abstractfactory;

public class BrightButton implements Button {
    public BrightButton() {
        System.out.println("Bright Button");
    }

    public Button createButton() {
        return new BrightButton();
    }
}
