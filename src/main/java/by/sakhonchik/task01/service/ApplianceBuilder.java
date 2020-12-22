package by.sakhonchik.task01.service;

import by.sakhonchik.task01.entity.*;

import java.util.Map;


public class ApplianceBuilder {

    public Appliance getBuiltAppliance(Map<String, Object> map) {
        switch ((String) map.get("name")) {
            case "Oven":
                return new Oven.OvenBuilder()
                        .withPowerConsumption((Integer) map.get("powerConsumption"))
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
//            case "Refrigerator":
//                Refrigerator refrigerator = new Refrigerator();
//                refrigerator.setPowerConsumption((Integer) map.get("powerConsumption"));
//                refrigerator.setWeight((Integer) map.get("weight"));
//                refrigerator.setFreezerCapacity((Integer) map.get("freezerCapacity"));
//                refrigerator.setOverallCapacity((Double) map.get("overallCapacity"));
//                refrigerator.setHeight((Integer) map.get("height"));
//                refrigerator.setWidth((Integer) map.get("width"));
//            case "Speakers":
//                Speakers speakers = new Speakers();
//                speakers.setPowerConsumption((Integer) map.get("powerConsumption"));
//                speakers.setNumberOfSpeakers((Integer) map.get("numberOfSpeakers"));
//                speakers.setFrequencyRange((Integer) map.get("frequencyRange"));
//                speakers.setCordLength((Integer) map.get("cordLength"));
//                return speakers;
            case "TabletPC":
                return new TabletPC.TabletPCBuilder()
                        .withBatteryCapacity((Integer) map.get("batteryCapacity"))
                        .withDisplayInches((Integer) map.get("displayInches"))
                        .withMemoryRom((Integer) map.get("memoryRom"))
                        .withFlashMemoryCapacity((Integer) map.get("flashMemoryCapacity"))
                        .withColor((String) map.get("color"))
                        .build();
//            case "VacuumCleaner":
//                VacuumCleaner vacuumCleaner = new VacuumCleaner();
//                vacuumCleaner.setPowerConsumption((Integer) map.get("powerConsumption"));
//                vacuumCleaner.setFilterType((String) map.get("filterType"));
//                vacuumCleaner.setBagType((String) map.get("bagType"));
//                vacuumCleaner.setWandType((String) map.get("wandType"));
//                vacuumCleaner.setMotorSpeedRegulation((Integer) map.get("motorSpeedRegulation"));
//                vacuumCleaner.setCleaningWidth((Integer) map.get("cleaningWidth"));
//                return vacuumCleaner;
            default:
                throw new IllegalArgumentException("Wrong appliance name or appliance parameters");
        }

    }
}
