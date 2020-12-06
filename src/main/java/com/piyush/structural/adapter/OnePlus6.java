package com.piyush.structural.adapter;

public class OnePlus6 implements USBTypeCPhone{
    @Override
    public void connect() {
        System.out.println("USB Type C is connected...");
    }

    @Override
    public void recharge() {
        System.out.println("Phone charging has started...");
    }
}
