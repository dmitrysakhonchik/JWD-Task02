package by.sakhonchik.task01.entity;

import java.util.Objects;

public class Speakers extends Appliance{
    private Integer powerConsumption;
    private Integer numberOfSpeakers;
    private Integer frequencyRange;
    private Integer cordLength;

    public Speakers(Integer powerConsumption, Integer numberOfSpeakers, Integer frequencyRange, Integer cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public Integer getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(Integer powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public Integer getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(Integer numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public Integer getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(Integer frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public Integer getCordLength() {
        return cordLength;
    }

    public void setCordLength(Integer cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return Objects.equals(powerConsumption, speakers.powerConsumption) && Objects.equals(numberOfSpeakers, speakers.numberOfSpeakers) && Objects.equals(frequencyRange, speakers.frequencyRange) && Objects.equals(cordLength, speakers.cordLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }
}
