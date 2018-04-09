package com.piyush.abstractfactory;

public class BrightButton implements com.nice.piyush.abstractfactory.Button {
    public BrightButton() {
        System.out.println("Bright Button");
    }

    public Button createButton() {
        return new BrightButton();
    }
}
