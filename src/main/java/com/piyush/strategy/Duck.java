package com.piyush.strategy;

public class Duck {
    private String type;
    private FlyingStrategy flyingStrategy;

    public Duck(String type, FlyingStrategy flyingStrategy) {
        this.type = type;
        this.flyingStrategy = flyingStrategy;
    }

    public void fly(){
        System.out.println(this.flyingStrategy.fly());
    }

    @Override
    public String toString() {
        return "Duck{" +
                "type='" + type + '\'' +
                ", flyingStrategy=" + flyingStrategy +
                '}';
    }
}
