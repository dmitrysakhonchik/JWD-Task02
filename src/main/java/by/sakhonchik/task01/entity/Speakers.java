package by.sakhonchik.task01.entity;

import java.util.Objects;

public class Speakers extends Appliance {

    private Integer powerConsumption;
    private Integer numberOfSpeakers;
    private Integer frequencyRange;
    private Integer cordLength;

    public static class SpeakersBuilder {
        private Speakers newSpeakers;

        public SpeakersBuilder() {
            newSpeakers = new Speakers();
        }

        public SpeakersBuilder withPowerConsumption(Integer powerConsumption) {
            newSpeakers.powerConsumption = powerConsumption;
            return this;
        }

        public SpeakersBuilder withNumberOfSpeakers(Integer numberOfSpeakers) {
            newSpeakers.numberOfSpeakers = numberOfSpeakers;
            return this;
        }

        public SpeakersBuilder withFrequencyRange(Integer frequencyRange) {
            newSpeakers.frequencyRange = frequencyRange;
            return this;
        }

        public SpeakersBuilder withCordLength(Integer cordLength) {
            newSpeakers.cordLength = cordLength;
            return this;
        }

        public Speakers build() {
            return newSpeakers;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speakers)) return false;
        Speakers speakers = (Speakers) o;
        return Objects.equals(powerConsumption, speakers.powerConsumption) && Objects.equals(numberOfSpeakers, speakers.numberOfSpeakers) && Objects.equals(frequencyRange, speakers.frequencyRange) && Objects.equals(cordLength, speakers.cordLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return "Speakers : " +
                "POWER_CONSUMPTION = " + powerConsumption +
                ", NUMBER_OF_SPEAKERS = " + numberOfSpeakers +
                ", FREQUENCY_RANGE = " + frequencyRange +
                ", CORD_LENGTH = " + cordLength;
    }
}
