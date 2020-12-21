package by.sakhonchik.task01.service;

import by.sakhonchik.task01.entity.*;

import java.util.Map;


public class ApplianceBuilder {

    public Appliance getBuiltAppliance(Map<String, Object> map) {
        switch ((String) map.get("name")) {
            case "Oven":
                Oven oven = new Oven();
                oven.setPowerConsumption((Integer) map.get("powerConsumption"));
                oven.setWeight((Integer) map.get("weight"));
                oven.setCapacity((Integer) map.get("capacity"));
                oven.setDepth((Integer) map.get("depth"));
                oven.setHeight((Double) map.get("height"));
                oven.setWidth((Double) map.get("width"));
                return oven;
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
