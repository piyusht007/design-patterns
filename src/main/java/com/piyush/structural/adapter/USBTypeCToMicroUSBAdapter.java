package com.piyush.structural.adapter;

public class USBTypeCToMicroUSBAdapter implements MicroUSBTypePhone {
    private final USBTypeCPhone usbTypeCPhone;

    public USBTypeCToMicroUSBAdapter(final USBTypeCPhone usbTypeCPhone) {
        this.usbTypeCPhone = usbTypeCPhone;
    }

    @Override
    public void connect() {
        System.out.println("Micro USB is connected...");
        usbTypeCPhone.connect();
    }

    @Override
    public void recharge() {
        usbTypeCPhone.recharge();
    }
}
