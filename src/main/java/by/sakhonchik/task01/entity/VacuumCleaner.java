package by.sakhonchik.task01.entity;

import java.util.Objects;

public class VacuumCleaner extends Appliance {

    private Integer powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private Integer motorSpeedRegulation;
    private Integer cleaningWidth;

    public VacuumCleaner() {
    }

    public VacuumCleaner(Integer powerConsumption, String filterType, String bagType,
                         String wandType, Integer motorSpeedRegulation, Integer cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
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
