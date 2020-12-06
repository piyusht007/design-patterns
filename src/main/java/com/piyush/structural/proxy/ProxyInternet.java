package com.piyush.structural.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements Internet {
    private final Internet internet = new RealInternet();
    private static final List<String> restrictedSites = new ArrayList<>();

    static {
        restrictedSites.addAll(Arrays.asList("http://www.restrictedSiteA.com", "http://www.restrictedSiteB.com"));
    }

    @Override
    public void connectTo(String server) throws Exception {
        if (restrictedSites.contains(server)) {
            System.out.println(String.format("This site %s is restricted and cannot be accessed.", server));
            throw new Exception("One of the restricted sites have been accessed.");
        } else {
            internet.connectTo(server);
        }
    }
}
