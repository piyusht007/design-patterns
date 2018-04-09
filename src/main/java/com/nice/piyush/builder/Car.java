package com.nice.piyush.builder;

public class Car {
    private FuelType fuelType;
    private int engineCapacity;
    private TransmissionType transmissionType;
    private Color color;
    private BodyType bodyType;
    private String model;

    public enum FuelType {
        PETROL, DIESEL;
    }

    public enum TransmissionType {
        MANUAL, AUTOMATIC;
    }

    public enum BodyType {
        HATCHBACK, SEDAN, SUV;
    }

    public enum Color {
        PASSION_RED, MYSTIQUE_BLUE, PANTHER_BLACK, STANDARD_WHITE;
    }


    public static class Builder {
        private FuelType fuelType;
        private int engineCapacity;
        private TransmissionType transmissionType;
        private Color color;
        private BodyType bodyType;
        private String model;

        public Builder withFuelType(final FuelType fuelType) {
            this.fuelType = fuelType;
            return this;
        }

        public Builder withEngineCapacity(final int engineCapacity) {
            this.engineCapacity = engineCapacity;
            return this;
        }

        public Builder withTransmissionType(final TransmissionType transmissionType) {
            this.transmissionType = transmissionType;
            return this;
        }

        public Builder withColor(final Color color) {
            this.color = color;
            return this;
        }

        public Builder withBodyType(final BodyType bodyType) {
            this.bodyType = bodyType;
            return this;
        }

        public Builder withModel(final String model) {
            this.model = (model == null || model.isEmpty()) ? "Standard" : model;
            return this;
        }

        public Car build() {
            this.validate();
            return new Car(this.fuelType,
                    this.engineCapacity,
                    this.transmissionType,
                    this.color,
                    this.bodyType,
                    this.model == null || this.model.isEmpty() ? "Standard" : model);
        }

        private void validate() {
            if (this.fuelType == null
                    || this.engineCapacity == 0
                    || this.bodyType == null
                    || this.color == null
                    || this.transmissionType == null) {
                throw new IllegalStateException("To construct a car you need to specify all the following properties:" +
                        "Fuel Type, Engine capacity, Transmission Type, Color, Body Type.");
            }
        }
    }

    private Car(FuelType fuelType, int engineCapacity, TransmissionType transmissionType, Color color, BodyType bodyType, String model) {
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.transmissionType = transmissionType;
        this.color = color;
        this.bodyType = bodyType;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car Specs: {" +
                "fuelType=" + fuelType +
                ", engineCapacity=" + engineCapacity +
                ", transmissionType=" + transmissionType +
                ", color=" + color +
                ", bodyType=" + bodyType +
                ", model='" + model + '\'' +
                '}';
    }
}
