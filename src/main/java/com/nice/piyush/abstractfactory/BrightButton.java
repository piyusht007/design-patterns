package com.nice.piyush.abstractfactory;

public class BrightButton implements Button {
    public BrightButton() {
        System.out.println("Bright Button");
    }

    public Button createButton() {
        return new BrightButton();
    }
}
