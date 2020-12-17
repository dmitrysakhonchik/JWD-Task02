package by.sakhonchik.task01.service;

import by.sakhonchik.task01.entity.*;


public class ApplianceFactory {

    public Appliance getAppliance(String[] applianceParameters,String applianceName) {

        switch (applianceName) {
            case "Oven":
                return new Oven.Builder()
                        .withPowerConsumption(Integer.parseInt(applianceParameters[0]))
                        .withWeight(Integer.parseInt(applianceParameters[1]))
                        .withCapacity(Integer.parseInt(applianceParameters[2]))
                        .withDepth(Integer.parseInt(applianceParameters[3]))
                        .withHeight(Double.parseDouble(applianceParameters[4]))
                        .withWidth(Double.parseDouble(applianceParameters[5]))
                        .build();

            case "Laptop":
                return new Laptop();
            case "Refrigerator":
                return new Refrigerator();
            case "Speakers":
                return new Speakers();
            case "TabletPC":
                return new TabletPC();
            case "VacuumCleaner":
                return new VacuumCleaner();
            default:
                return null;
        }

    }
}
