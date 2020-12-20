package by.sakhonchik.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance {
    private Double batteryCapacity;
    private String os;
    private Integer memoryRom;
    private Integer systemMemory;
    private Double cpu;
    private Integer displayInches;

    public static class LaptopBuilder {
        private Laptop newLaptop;

        public LaptopBuilder() {
            newLaptop = new Laptop();
        }

        public LaptopBuilder withBatteryCapacity(Double batteryCapacity) {
            newLaptop.batteryCapacity = batteryCapacity;
            return this;
        }

        public LaptopBuilder withOs(String os) {
            newLaptop.os = os;
            return this;
        }

        public LaptopBuilder withMemoryRom(Integer memoryRom) {
            newLaptop.memoryRom = memoryRom;
            return this;
        }

        public LaptopBuilder withSystemMemory(Integer systemMemory) {
            newLaptop.systemMemory = systemMemory;
            return this;
        }

        public LaptopBuilder withCpu(Double cpu) {
            newLaptop.cpu = cpu;
            return this;
        }

        public LaptopBuilder withDisplayInches(Integer displayInches) {
            newLaptop.displayInches = displayInches;
            return this;
        }


        public Laptop build() {
            return newLaptop;
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(batteryCapacity, laptop.batteryCapacity) && Objects.equals(os, laptop.os) && Objects.equals(memoryRom, laptop.memoryRom) && Objects.equals(systemMemory, laptop.systemMemory) && Objects.equals(cpu, laptop.cpu) && Objects.equals(displayInches, laptop.displayInches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInches);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInches=" + displayInches +
                '}';
    }
}
