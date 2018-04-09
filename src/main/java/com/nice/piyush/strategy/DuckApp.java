package com.nice.piyush.strategy;

public class DuckApp {
    public static void main(String[] args) {
        Duck toyDuck = new Duck("ToyDuck", new NoFlyingStrategy());
        Duck donaldDuck = new Duck("DonaldDuck", new SlowFlyingStrategy());
        Duck fastDuck = new Duck("FastDuck", new FastFlyingStrategy());

        fly(toyDuck);
        fly(donaldDuck);
        fly(fastDuck);
    }

    private static void fly(Duck duck){
        duck.fly();
    }
}
