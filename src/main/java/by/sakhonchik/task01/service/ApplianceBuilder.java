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
                Laptop laptop = new Laptop();
                laptop.setBatteryCapacity((Double) map.get("batteryCapacity"));
                laptop.setOs((String) map.get("os"));
                laptop.setMemoryRom((Integer) map.get("memoryRom"));
                laptop.setSystemMemory((Integer) map.get("systemMemory"));
                laptop.setCpu((Double) map.get("cpu"));
                laptop.setDisplayInches((Integer) map.get("displayInches"));
                return laptop;
            case "Refrigerator":
                Refrigerator refrigerator = new Refrigerator();
                refrigerator.setPowerConsumption((Integer) map.get("powerConsumption"));
                refrigerator.setWeight((Integer) map.get("weight"));
                refrigerator.setFreezerCapacity((Integer) map.get("freezerCapacity"));
                refrigerator.setOverallCapacity((Double) map.get("overallCapacity"));
                refrigerator.setHeight((Integer) map.get("height"));
                refrigerator.setWidth((Integer) map.get("width"));
            case "Speakers":
                Speakers speakers = new Speakers();
                speakers.setPowerConsumption((Integer) map.get("powerConsumption"));
                speakers.setNumberOfSpeakers((Integer) map.get("numberOfSpeakers"));
                speakers.setFrequencyRange((Integer) map.get("frequencyRange"));
                speakers.setCordLength((Integer) map.get("cordLength"));
                return speakers;
            case "TabletPC":
                TabletPC tabletPC = new TabletPC();
                tabletPC.setBatteryCapacity((Integer) map.get("batteryCapacity"));
                tabletPC.setDisplayInches((Integer) map.get("displayInches"));
                tabletPC.setMemoryRom((Integer) map.get("memoryRom"));
                tabletPC.setFlashMemoryCapacity((Integer) map.get("flashMemoryCapacity"));
                tabletPC.setColor((String) map.get("color"));
                return tabletPC;
            case "VacuumCleaner":
                VacuumCleaner vacuumCleaner = new VacuumCleaner();
                vacuumCleaner.setPowerConsumption((Integer) map.get("powerConsumption"));
                vacuumCleaner.setFilterType((String) map.get("filterType"));
                vacuumCleaner.setBagType((String) map.get("bagType"));
                vacuumCleaner.setWandType((String) map.get("wandType"));
                vacuumCleaner.setMotorSpeedRegulation((Integer) map.get("motorSpeedRegulation"));
                vacuumCleaner.setCleaningWidth((Integer) map.get("cleaningWidth"));
                return vacuumCleaner;
            default:
                throw new IllegalArgumentException("Wrong appliance name or appliance parameters");
        }

    }
}
