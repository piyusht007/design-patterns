package com.piyush.structural.proxy;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String server) throws Exception {
        System.out.println("Connecting to: " + server);
    }
}
