package by.sakhonchik.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance {

    private Integer powerConsumption;
    private Integer weight;
    private Integer freezerCapacity;
    private Double overallCapacity;
    private Integer height;
    private Integer width;

    public static class RefrigeratorBuilder {
        private Refrigerator newRefrigerator;

        public RefrigeratorBuilder() {
            newRefrigerator = new Refrigerator();
        }

        public RefrigeratorBuilder withRefrigeratorPowerConsumption(Integer powerConsumption) {
            newRefrigerator.powerConsumption = powerConsumption;
            return this;
        }

        public RefrigeratorBuilder withWeight(Integer weight) {
            newRefrigerator.weight = weight;
            return this;
        }

        public RefrigeratorBuilder withFreezerCapacity(Integer freezerCapacity) {
            newRefrigerator.freezerCapacity = freezerCapacity;
            return this;
        }

        public RefrigeratorBuilder withOverallCapacity(Double overallCapacity) {
            newRefrigerator.overallCapacity = overallCapacity;
            return this;
        }

        public RefrigeratorBuilder withHeight(Integer height) {
            newRefrigerator.height = height;
            return this;
        }

        public RefrigeratorBuilder withWidth(Integer width) {
            newRefrigerator.width = width;
            return this;
        }

        public Refrigerator build() {
            return newRefrigerator;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Refrigerator)) return false;
        Refrigerator that = (Refrigerator) o;
        return Objects.equals(powerConsumption, that.powerConsumption) && Objects.equals(weight, that.weight) && Objects.equals(freezerCapacity, that.freezerCapacity) && Objects.equals(overallCapacity, that.overallCapacity) && Objects.equals(height, that.height) && Objects.equals(width, that.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    @Override
    public String toString() {
        return "Refrigerator : " +
                "POWER_CONSUMPTION = " + powerConsumption +
                ", WEIGHT = " + weight +
                ", FREEZER_CAPACITY = " + freezerCapacity +
                ", OVERALL_CAPACITY = " + overallCapacity +
                ", HEIGHT = " + height +
                ", WIDTH = " + width;
    }
}
