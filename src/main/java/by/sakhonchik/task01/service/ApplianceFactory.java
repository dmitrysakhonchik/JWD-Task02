package by.sakhonchik.task01.service;

import by.sakhonchik.task01.entity.*;

public class ApplianceFactory {

    public Appliance getAppliance(String criteria) {

        switch (criteria) {
            case "Oven":
                return new Oven();
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
