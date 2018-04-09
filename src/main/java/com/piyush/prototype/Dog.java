package com.piyush.prototype;

import java.util.Objects;

public class Dog implements Animal {
    private String breed;
    private String color;

    public Dog(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

    @Override
    public Animal copy() {
        final Animal clonedDog = new Dog(this.breed, this.color);
        return clonedDog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed) &&
                Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, color);
    }
}
