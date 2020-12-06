package com.piyush.behavioral.strategy;

import org.junit.jupiter.api.Test;

public class StrategyTest {
    @Test
    public void testFlyingStrategy(){
        final Duck toyDuck = new Duck("ToyDuck", new NoFlyingStrategy());
        final Duck donaldDuck = new Duck("DonaldDuck", new SlowFlyingStrategy());
        final Duck fastDuck = new Duck("FastDuck", new FastFlyingStrategy());

        fly(toyDuck);
        fly(donaldDuck);
        fly(fastDuck);
    }

    private static void fly(Duck duck){
        duck.fly();
    }
}
