package by.sakhonchik.task01.entity;

import java.util.Objects;

public class TabletPC extends Appliance {

    private Integer batteryCapacity;
    private Integer displayInches;
    private Integer memoryRom;
    private Integer flashMemoryCapacity;
    private String color;

    public TabletPC() {
    }

    public TabletPC(Integer batteryCapacity, Integer displayInches, Integer memoryRom,
                    Integer flashMemoryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Objects.equals(batteryCapacity, tabletPC.batteryCapacity) && Objects.equals(displayInches, tabletPC.displayInches) && Objects.equals(memoryRom, tabletPC.memoryRom) && Objects.equals(flashMemoryCapacity, tabletPC.flashMemoryCapacity) && Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC : " +
                "BATTERY_CAPACITY = " + batteryCapacity +
                ", DISPLAY_INCHES = " + displayInches +
                ", MEMORY_ROM = " + memoryRom +
                ", FLASH_MEMORY_CAPACITY = " + flashMemoryCapacity +
                ", COLOR = '" + color;
    }
}
