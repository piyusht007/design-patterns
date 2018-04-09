package com.piyush.abstractfactory;

public class DarkButton implements Button {
    public DarkButton() {
        System.out.println("Dark Button");
    }

    public Button createButton() {
        return new DarkButton();
    }
}
