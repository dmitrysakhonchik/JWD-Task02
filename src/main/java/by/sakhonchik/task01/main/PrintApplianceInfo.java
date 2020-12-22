package by.sakhonchik.task01.main;

import by.sakhonchik.task01.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {

    public static void print(List<Appliance> appliances) {
        appliances.forEach(System.out::println);
    }

    // you may add your own code here

}
