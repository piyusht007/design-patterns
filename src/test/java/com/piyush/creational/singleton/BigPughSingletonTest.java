package com.piyush.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BigPughSingletonTest {

    @Test
    void getInstance() {
        // Validate if each call to getInstance yields in the same object
        final BigPughSingleton[] firstInstance = new BigPughSingleton[1];
        final BigPughSingleton[] secondInstance = new BigPughSingleton[1];

        new Thread(() -> firstInstance[0] = BigPughSingleton.getInstance()).start();
        new Thread(() -> secondInstance[0] = BigPughSingleton.getInstance()).start();

        try {
            // Waiting for the threads to finish..
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(firstInstance[0]);
        System.out.println(secondInstance[0]);

        Assertions.assertTrue(firstInstance[0] == secondInstance[0]);
    }
}