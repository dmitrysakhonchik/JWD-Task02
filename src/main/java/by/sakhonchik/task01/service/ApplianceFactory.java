package by.sakhonchik.task01.service;

import by.sakhonchik.task01.entity.*;
import by.sakhonchik.task01.entity.criteria.Criteria;

public class ApplianceFactory {

    public Appliance getAppliance(String criteria) {
        String nameOfAppliance = criteria.getGroupSearchName();

        switch (nameOfAppliance) {
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
