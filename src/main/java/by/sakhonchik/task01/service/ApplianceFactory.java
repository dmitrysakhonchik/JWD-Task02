package by.sakhonchik.task01.service;

import by.sakhonchik.task01.entity.*;


public class ApplianceFactory {

    public Appliance getBuiltAppliance(String[] applianceParameters, String applianceName) {
        switch (applianceName) {
            case "Oven":
                return new Oven.OvenBuilder()
                        .withOvenPowerConsumption(Integer.parseInt(applianceParameters[0]))
                        .withWeight(Integer.parseInt(applianceParameters[1]))
                        .withCapacity(Integer.parseInt(applianceParameters[2]))
                        .withDepth(Integer.parseInt(applianceParameters[3]))
                        .withHeight(Double.parseDouble(applianceParameters[4]))
                        .withWidth(Double.parseDouble(applianceParameters[5]))
                        .build();
            case "Laptop":
                return new Laptop.LaptopBuilder()
                        .withBatteryCapacity(Double.parseDouble(applianceParameters[0]))
                        .withOs(applianceParameters[1])
                        .withMemoryRom(Integer.parseInt(applianceParameters[2]))
                        .withSystemMemory(Integer.parseInt(applianceParameters[3]))
                        .withCpu(Double.parseDouble(applianceParameters[4]))
                        .withDisplayInches(Integer.parseInt(applianceParameters[5]))
                        .build();
            case "Refrigerator":
                return new Refrigerator.RefrigeratorBuilder()
                        .withRefrigeratorPowerConsumption(Integer.parseInt(applianceParameters[0]))
                        .withWeight(Integer.parseInt(applianceParameters[1]))
                        .withFreezerCapacity(Integer.parseInt(applianceParameters[2]))
                        .withOverallCapacity(Double.parseDouble(applianceParameters[3]))
                        .withHeight(Integer.parseInt(applianceParameters[4]))
                        .withWidth(Integer.parseInt(applianceParameters[5]))
                        .build();
            case "Speakers":
                return new Speakers();
            case "TabletPC":
                return new TabletPC();
            case "VacuumCleaner":
                return new VacuumCleaner();
            default:
                throw new IllegalArgumentException("Wrong appliance name or appliance parameters");
        }

    }
}
