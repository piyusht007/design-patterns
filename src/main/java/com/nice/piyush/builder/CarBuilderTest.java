package com.nice.piyush.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarBuilderTest {
    @Test
    public void buildWithAllTheSpecs() {
        final Car baleno = new Car.Builder()
                .withBodyType(Car.BodyType.HATCHBACK)
                .withEngineCapacity(1200)
                .withColor(Car.Color.MYSTIQUE_BLUE)
                .withTransmissionType(Car.TransmissionType.AUTOMATIC)
                .withFuelType(Car.FuelType.PETROL)
                .build();

        Assertions.assertNotNull(baleno);
    }

    @Test
    public void buildWithMissingBodyType() {
        Assertions.assertThrows(IllegalStateException.class, () -> {
            new Car.Builder()
                    .withEngineCapacity(1200)
                    .withColor(Car.Color.MYSTIQUE_BLUE)
                    .withTransmissionType(Car.TransmissionType.AUTOMATIC)
                    .withFuelType(Car.FuelType.PETROL)
                    .build();
        });
    }

    @Test
    public void buildWithMissingFuelType() {
        Assertions.assertThrows(IllegalStateException.class, () -> {
            new Car.Builder()
                    .withBodyType(Car.BodyType.HATCHBACK)
                    .withEngineCapacity(1200)
                    .withColor(Car.Color.MYSTIQUE_BLUE)
                    .withTransmissionType(Car.TransmissionType.AUTOMATIC)
                    .build();
        });
    }

    @Test
    public void buildWithMissingColor() {
        Assertions.assertThrows(IllegalStateException.class, () -> {
            new Car.Builder()
                    .withBodyType(Car.BodyType.HATCHBACK)
                    .withEngineCapacity(1200)
                    .withTransmissionType(Car.TransmissionType.AUTOMATIC)
                    .withFuelType(Car.FuelType.PETROL)
                    .build();
        });
    }

    @Test
    public void buildWithMissingTransmission() {
        Assertions.assertThrows(IllegalStateException.class, () -> {
            new Car.Builder()
                    .withBodyType(Car.BodyType.HATCHBACK)
                    .withEngineCapacity(1200)
                    .withColor(Car.Color.MYSTIQUE_BLUE)
                    .withFuelType(Car.FuelType.PETROL)
                    .build();
        });
    }

    @Test
    public void buildWithMissingEngine() {
        Assertions.assertThrows(IllegalStateException.class, () -> {
            new Car.Builder()
                    .withBodyType(Car.BodyType.HATCHBACK)
                    .withColor(Car.Color.MYSTIQUE_BLUE)
                    .withTransmissionType(Car.TransmissionType.AUTOMATIC)
                    .withFuelType(Car.FuelType.PETROL)
                    .build();
        });
    }
}
