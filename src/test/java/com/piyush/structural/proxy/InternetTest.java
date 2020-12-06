package com.piyush.structural.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InternetTest {

    @Test
    void connectToNonRestrictedSite() throws Exception {
        final Internet internet = new ProxyInternet();

        internet.connectTo("http://www.google.com");
    }

    @Test
    void connectToRestrictedSite() {
        final Internet internet = new ProxyInternet();

        Assertions.assertThrows(Exception.class,
                () -> internet.connectTo("http://www.restrictedSiteA.com"),
                "One of the restricted sites have been accessed.");
    }
}