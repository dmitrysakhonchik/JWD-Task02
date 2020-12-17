package by.sakhonchik.task01.entity;

public class Laptop extends Appliance {
    private Double batteryCapacity;
    private String os;
    private Integer memoryRom;
    private Integer systemMemory;
    private Double cpu;
    private Integer displayInches;

    public static class Builder {
        private Laptop newLaptop;



        public Laptop build() {
            return newLaptop;
        }


    }


}
