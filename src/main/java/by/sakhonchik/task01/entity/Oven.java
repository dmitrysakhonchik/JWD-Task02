package by.sakhonchik.task01.entity;

import java.util.Objects;

public class Oven extends Appliance {

    private Integer powerConsumption;
    private Integer weight;
    private Integer capacity;
    private Integer depth;
    private Double height;
    private Double width;

    public static class OvenBuilder {
        private Oven newOven;

        public OvenBuilder() {
            newOven = new Oven();
        }

        public OvenBuilder withOvenPowerConsumption(Integer powerConsumption) {
            newOven.powerConsumption = powerConsumption;
            return this;
        }

        public OvenBuilder withWeight(Integer weight) {
            newOven.weight = weight;
            return this;
        }

        public OvenBuilder withCapacity(Integer capacity) {
            newOven.capacity = capacity;
            return this;
        }

        public OvenBuilder withDepth(Integer depth) {
            newOven.depth = depth;
            return this;
        }

        public OvenBuilder withHeight(Double height) {
            newOven.height = height;
            return this;
        }

        public OvenBuilder withWidth(Double width) {
            newOven.width = width;
            return this;
        }

        public Oven build() {
            return newOven;
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return Objects.equals(powerConsumption, oven.powerConsumption) && Objects.equals(weight, oven.weight) && Objects.equals(capacity, oven.capacity) && Objects.equals(depth, oven.depth) && Objects.equals(height, oven.height) && Objects.equals(width, oven.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, capacity, depth, height, width);
    }

    @Override
    public String toString() {
        return "Oven : " +
                "POWER_CONSUMPTION = " + powerConsumption +
                ", WEIGHT = " + weight +
                ", CAPACITY = " + capacity +
                ", DEPTH = " + depth +
                ", HEIGHT = " + height +
                ", WIDTH = " + width;
    }
}