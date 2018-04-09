package com.piyush.prototype;

public class App {
    public static void main(String[] args) {
        final Animal dog = new Dog("German Shepherd", "Black And Brown");
        final Animal clonedDog = dog.copy();

        if(dog == clonedDog){
            System.out.println("Reference Equality.");
        }

        if(dog.equals(clonedDog)){
            System.out.println("Actual Equality.");
        }

    }
}
