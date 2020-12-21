package by.sakhonchik.task01.service;

import by.sakhonchik.task01.entity.*;

import java.util.Map;


public class ApplianceBuilder {

    public Appliance getBuiltAppliance(Map<String, Object> map) {
        switch ((String) map.get("name")) {
            case "Oven":
                return new Oven.OvenBuilder()
                        .withOvenPowerConsumption((Integer) map.get("powerConsumption"))
                        .withWeight((Integer) map.get("weight"))
                        .withCapacity((Integer) map.get("capacity"))
                        .withDepth((Integer) map.get("depth"))
                        .withHeight((Double) map.get("height"))
                        .withWidth((Double) map.get("width"))
                        .build();
            case "Laptop":
                return new Laptop.LaptopBuilder()
                        .withBatteryCapacity((Double) map.get("batteryCapacity"))
                        .withOs((String) map.get("os"))
                        .withMemoryRom((Integer) map.get("memoryRom"))
                        .withSystemMemory((Integer) map.get("systemMemory"))
                        .withCpu((Double) map.get("cpu"))
                        .withDisplayInches((Integer) map.get("displayInches"))
                        .build();
            case "Refrigerator":
                return new Refrigerator.RefrigeratorBuilder()
                        .withRefrigeratorPowerConsumption((Integer) map.get("powerConsumption"))
                        .withWeight((Integer) map.get("weight"))
                        .withFreezerCapacity((Integer) map.get("freezerCapacity"))
                        .withOverallCapacity((Double) map.get("overallCapacity"))
                        .withHeight((Integer) map.get("height"))
                        .withWidth((Integer) map.get("width"))
                        .build();
            case "Speakers":
                return new Speakers.SpeakersBuilder()
                        .withPowerConsumption((Integer) map.get("powerConsumption"))
                        .withNumberOfSpeakers((Integer) map.get("numberOfSpeakers"))
                        .withFrequencyRange((Integer) map.get("frequencyRange"))
                        .withCordLength((Integer) map.get("cordLength"))
                        .build();
            case "TabletPC":
                return new TabletPC.TabletPCBuilder()
                        .withBatteryCapacity((Integer) map.get("batteryCapacity"))
                        .withDisplayInches((Integer) map.get("displayInches"))
                        .withMemoryRom((Integer) map.get("memoryRom"))
                        .withFlashMemoryCapacity((Integer) map.get("flashMemoryCapacity"))
                        .withColor((String) map.get("color"))
                        .build();
            case "VacuumCleaner":
                return new VacuumCleaner.VacuumCleanerBuilder()
                        .withPowerConsumption((Integer) map.get("powerConsumption"))
                        .withFilterType((String) map.get("filterType"))
                        .withBagType((String) map.get("bagType"))
                        .withWandType((String) map.get("wandType"))
                        .withMotorSpeedRegulation((Integer) map.get("motorSpeedRegulation"))
                        .withCleaningWidth((Integer) map.get("cleaningWidth"))
                        .build();


            default:
                throw new IllegalArgumentException("Wrong appliance name or appliance parameters");
        }

    }
}
