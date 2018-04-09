package com.nice.piyush.builder;

public class App {
    public static void main(String[] args) {
        System.out.println(newBaleno());
        System.out.println(newI20());
    }

    public static Car newBaleno() {
        return new Car.Builder()
                .withBodyType(Car.BodyType.HATCHBACK)
                .withEngineCapacity(1200)
                .withColor(Car.Color.MYSTIQUE_BLUE)
                .withTransmissionType(Car.TransmissionType.AUTOMATIC)
                .withFuelType(Car.FuelType.PETROL)
                .build();
    }

    public static Car newI20() {
        return new Car.Builder()
                .withBodyType(Car.BodyType.HATCHBACK)
                .withEngineCapacity(1200)
                .withColor(Car.Color.PANTHER_BLACK)
                .withTransmissionType(Car.TransmissionType.MANUAL)
                .withFuelType(Car.FuelType.DIESEL)
                .withModel("Sportz")
                .build();
    }
}
