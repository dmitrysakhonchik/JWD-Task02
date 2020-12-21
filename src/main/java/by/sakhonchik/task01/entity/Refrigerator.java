package by.sakhonchik.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance {

    private Integer powerConsumption;
    private Integer weight;
    private Integer freezerCapacity;
    private Double overallCapacity;
    private Integer height;
    private Integer width;

    public Refrigerator() {
    }

    public Refrigerator(Integer powerConsumption, Integer weight, Integer freezerCapacity,
                        Double overallCapacity, Integer height, Integer width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setWidth(Integer width) {
        this.width = width;
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
