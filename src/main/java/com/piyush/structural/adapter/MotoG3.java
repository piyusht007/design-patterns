package com.piyush.structural.adapter;

public class MotoG3 implements MicroUSBTypePhone{
    @Override
    public void connect() {
        System.out.println("Micro USB is connected...");
    }

    @Override
    public void recharge() {
        System.out.println("Phone charging has started...");
    }
}
