package by.sakhonchik.task01.entity;

import java.util.Objects;

public class VacuumCleaner extends Appliance {

    private Integer powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private Integer motorSpeedRegulation;
    private Integer cleaningWidth;

    public static class VacuumCleanerBuilder {
        private VacuumCleaner newVacuumCleaner;

        public VacuumCleanerBuilder() {
            newVacuumCleaner = new VacuumCleaner();
        }

        public VacuumCleanerBuilder withPowerConsumption(Integer powerConsumption) {
            newVacuumCleaner.powerConsumption = powerConsumption;
            return this;
        }

        public VacuumCleanerBuilder withFilterType(String filterType) {
            newVacuumCleaner.filterType = filterType;
            return this;
        }

        public VacuumCleanerBuilder withBagType(String bagType) {
            newVacuumCleaner.bagType = bagType;
            return this;
        }

        public VacuumCleanerBuilder withWandType(String wandType) {
            newVacuumCleaner.wandType = wandType;
            return this;
        }

        public VacuumCleanerBuilder withMotorSpeedRegulation(Integer motorSpeedRegulation) {
            newVacuumCleaner.motorSpeedRegulation = motorSpeedRegulation;
            return this;
        }

        public VacuumCleanerBuilder withCleaningWidth(Integer cleaningWidth) {
            newVacuumCleaner.cleaningWidth = cleaningWidth;
            return this;
        }

        public VacuumCleaner build() {
            return newVacuumCleaner;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Objects.equals(powerConsumption, that.powerConsumption) && Objects.equals(filterType, that.filterType) && Objects.equals(bagType, that.bagType) && Objects.equals(wandType, that.wandType) && Objects.equals(motorSpeedRegulation, that.motorSpeedRegulation) && Objects.equals(cleaningWidth, that.cleaningWidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    @Override
    public String toString() {
        return "VacuumCleaner : " +
                "POWER_CONSUMPTION = " + powerConsumption +
                ", FILTER_TYPE = '" + filterType + '\'' +
                ", BAG_TYPE = '" + bagType + '\'' +
                ", WAND_TYPE = '" + wandType + '\'' +
                ", MOTOR_SPEED_REGULATION = " + motorSpeedRegulation +
                ", CLEANING_WIDTH = " + cleaningWidth;
    }
}
