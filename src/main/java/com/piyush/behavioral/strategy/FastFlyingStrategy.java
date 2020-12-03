package com.piyush.behavioral.strategy;

public class FastFlyingStrategy implements FlyingStrategy {
    @Override
    public String fly() {
        return "This duck's flying speed is fast....";
    }
}
