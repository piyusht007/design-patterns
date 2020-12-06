package com.piyush.creational.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrototypeTest {
    @Test
    public void testPrototype(){
        final Animal dog = new Dog("German Shepherd", "Black And Brown");
        final Animal clonedDog = dog.copy();

        Assertions.assertTrue(dog.equals(clonedDog));
        Assertions.assertTrue(dog.hashCode() == clonedDog.hashCode());
    }
}
