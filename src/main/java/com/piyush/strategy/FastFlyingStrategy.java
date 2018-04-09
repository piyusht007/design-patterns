package com.piyush.strategy;

public class FastFlyingStrategy implements FlyingStrategy {
    @Override
    public String fly() {
        return "This duck's flying speed is fast....";
    }
}
