package by.sakhonchik.task01.entity;

import java.util.Objects;

public class Oven extends Appliance {
    private Integer powerConsumption;
    private Integer weight;
    private Integer capacity;
    private Integer depth;
    private Double height;
    private Double width;

    public static class Builder {
        private Oven newOven;

        public Builder() {
            newOven = new Oven();
        }

        public Builder withPowerConsumption(Integer powerConsumption) {
            newOven.powerConsumption = powerConsumption;
            return this;
        }

        public Builder withWeight(Integer weight) {
            newOven.weight = weight;
            return this;
        }

        public Builder withCapacity(Integer capacity) {
            newOven.capacity = capacity;
            return this;
        }

        public Builder withDepth(Integer depth) {
            newOven.depth = depth;
            return this;
        }

        public Builder withHeight(Double height) {
            newOven.height = height;
            return this;
        }

        public Builder withWidth(Double width) {
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
}