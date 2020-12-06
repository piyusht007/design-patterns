package com.piyush.structural.adapter;

import org.junit.jupiter.api.Test;

public class AdapterTest {
    @Test
    public void testUSBTypeCToMicroUSBTypeAdapter(){
        USBTypeCPhone onePlus6 = new OnePlus6();
        MicroUSBTypePhone microUSBTypePhone = new USBTypeCToMicroUSBAdapter(onePlus6);

        System.out.println("Recharging OnePlus6 with Micro USB...");
        microUSBTypePhone.connect();
        microUSBTypePhone.recharge();
    }
}
