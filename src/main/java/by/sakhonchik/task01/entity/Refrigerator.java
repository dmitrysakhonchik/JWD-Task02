package by.sakhonchik.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance{
    private Integer powerConsumption;
    private Integer weight;
    private Integer freezerCapacity;
    private Integer overallCapacity;
    private Integer height;

    public Refrigerator(Integer powerConsumption, Integer weight, Integer freezerCapacity, Integer overallCapacity, Integer height) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
    }

    public Integer getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(Integer powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(Integer freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public Integer getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(Integer overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return Objects.equals(powerConsumption, that.powerConsumption) && Objects.equals(weight, that.weight) && Objects.equals(freezerCapacity, that.freezerCapacity) && Objects.equals(overallCapacity, that.overallCapacity) && Objects.equals(height, that.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, freezerCapacity, overallCapacity, height);
    }
}
