package by.sakhonchik.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance {
    private Double batteryCapacity;
    private String os;
    private Integer memoryRom;
    private Integer systemMemory;
    private Double cpu;
    private Integer displayInches;

    public Laptop() {
    }

    public Laptop(Double batteryCapacity, String os, Integer memoryRom,
                  Integer systemMemory, Double cpu, Integer displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    @Override
    public Double getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public String getOs() {
        return os;
    }

    @Override
    public Integer getMemoryRom() {
        return memoryRom;
    }

    @Override
    public Integer getSystemMemory() {
        return systemMemory;
    }

    @Override
    public Double getCpu() {
        return cpu;
    }

    @Override
    public Integer getDisplayInches() {
        return displayInches;
    }

    @Override
    public void setBatteryCapacity(Double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public void setMemoryRom(Integer memoryRom) {
        this.memoryRom = memoryRom;
    }

    @Override
    public void setSystemMemory(Integer systemMemory) {
        this.systemMemory = systemMemory;
    }

    @Override
    public void setCpu(Double cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setDisplayInches(Integer displayInches) {
        this.displayInches = displayInches;
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
        return "Laptop : " +
                "BATTERY_CAPACITY = " + batteryCapacity +
                ", OS = '" + os + '\'' +
                ", MEMORY_ROM = " + memoryRom +
                ", SYSTEM_MEMORY = " + systemMemory +
                ", CPU = " + cpu +
                ", DISPLAY_INCHES = " + displayInches;
    }
}
