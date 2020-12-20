package by.sakhonchik.task01.entity;

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

}
