package com.piyush.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PizzaTest {
    @Test
    public void farmHouseWithJalapeno() {
        final Pizza farmHouse = new FarmHouse();
        final ToppingDecorator toppingDecorator = new Jalapeno(farmHouse);

        Assertions.assertEquals("FarmHouse, Jalapeno", toppingDecorator.getDescription());
        Assertions.assertEquals(Double.valueOf(375), toppingDecorator.cost());
    }

    @Test
    public void marghertiaWithJalapeno() {
        final Pizza margherita = new Margherita();
        final ToppingDecorator toppingDecorator = new Jalapeno(margherita);

        Assertions.assertEquals("Margherita, Jalapeno", toppingDecorator.getDescription());
        Assertions.assertEquals(Double.valueOf(345), toppingDecorator.cost());
    }
}