package by.sakhonchik.task01.service;

import java.util.HashMap;
import java.util.Map;

public class ApplianceParser {

    Map<String, Object> getOvenParameters(String[] param) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("name", param[0]);
        parameters.put("powerConsumption", Integer.parseInt(
                param[2].substring(param[2].indexOf("=") + 1, param[2].indexOf(","))));
        parameters.put("weight", Integer.parseInt(
                param[3].substring(param[3].indexOf("=") + 1, param[3].indexOf(","))));
        parameters.put("capacity", Integer.parseInt(
                param[4].substring(param[4].indexOf("=") + 1, param[4].indexOf(","))));
        parameters.put("depth", Integer.parseInt(
                param[5].substring(param[5].indexOf("=") + 1, param[5].indexOf(","))));
        parameters.put("height", Double.parseDouble(
                param[6].substring(param[6].indexOf("=") + 1, param[6].indexOf(","))));
        parameters.put("width", Double.parseDouble(
                param[7].substring(param[6].indexOf("=") + 1)));
        return parameters;
    }

    Map<String, Object> getLaptopParameters(String[] param) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("name", param[0]);
        parameters.put("batteryCapacity", Double.parseDouble(
                param[2].substring(param[2].indexOf("=") + 1, param[2].indexOf(","))));
        parameters.put("os",
                param[3].substring(param[3].indexOf("=") + 1, param[3].indexOf(",")));
        parameters.put("memoryRom", Integer.parseInt(
                param[4].substring(param[4].indexOf("=") + 1, param[4].indexOf(","))));
        parameters.put("systemMemory", Integer.parseInt(
                param[5].substring(param[5].indexOf("=") + 1, param[5].indexOf(","))));
        parameters.put("cpu", Double.parseDouble(
                param[6].substring(param[6].indexOf("=") + 1, param[6].indexOf(","))));
        parameters.put("displayInches", Integer.parseInt(
                param[7].substring(param[7].indexOf("=") + 1)));
        return parameters;
    }

    Map<String, Object> getRefrigeratorParameters(String[] param) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("name", param[0]);
        parameters.put("powerConsumption", Integer.parseInt(
                param[2].substring(param[2].indexOf("=") + 1, param[2].indexOf(","))));
        parameters.put("weight", Integer.parseInt(
                param[3].substring(param[3].indexOf("=") + 1, param[3].indexOf(","))));
        parameters.put("freezerCapacity", Integer.parseInt(
                param[4].substring(param[4].indexOf("=") + 1, param[4].indexOf(","))));
        parameters.put("overallCapacity", Double.parseDouble(
                param[5].substring(param[5].indexOf("=") + 1, param[5].indexOf(","))));
        parameters.put("height", Integer.parseInt(
                param[6].substring(param[6].indexOf("=") + 1, param[6].indexOf(","))));
        parameters.put("width", Integer.parseInt(
                param[7].substring(param[7].indexOf("=") + 1)));
        return parameters;
    }

    Map<String, Object> getVacuumCleanerParameters(String[] param) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("name", param[0]);
        parameters.put("powerConsumption", Integer.parseInt(
                param[2].substring(param[2].indexOf("=") + 1, param[2].indexOf(","))));
        parameters.put("filterType",
                param[3].substring(param[3].indexOf("=") + 1, param[3].indexOf(",")));
        parameters.put("bagType",
                param[4].substring(param[4].indexOf("=") + 1, param[4].indexOf(",")));
        parameters.put("wandType",
                param[5].substring(param[5].indexOf("=") + 1, param[5].indexOf(",")));
        parameters.put("motorSpeedRegulation", Integer.parseInt(
                param[6].substring(param[6].indexOf("=") + 1, param[6].indexOf(","))));
        parameters.put("cleaningWidth", Integer.parseInt(
                param[7].substring(param[7].indexOf("=") + 1)));
        return parameters;
    }

    Map<String, Object> getSpeakersParameters(String[] param) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("name", param[0]);
        parameters.put("powerConsumption", Integer.parseInt(
                param[2].substring(param[2].indexOf("=") + 1, param[2].indexOf(","))));
        parameters.put("numberOfSpeakers", Integer.parseInt(
                param[3].substring(param[3].indexOf("=") + 1, param[3].indexOf(","))));
        parameters.put("frequencyRange", Integer.parseInt(
                param[4].substring(param[4].indexOf("=") + 1, param[4].indexOf(",")))); //TODO For RANGE input string: "2-4"
        parameters.put("cordLength", Integer.parseInt(
                param[5].substring(param[5].indexOf("=") + 1)));
        return parameters;
    }

    Map<String, Object> getTabletPCParameters(String[] param) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("name", param[0]);
        parameters.put("batteryCapacity", Integer.parseInt(
                param[2].substring(param[2].indexOf("=") + 1, param[2].indexOf(","))));
        parameters.put("displayInches", Integer.parseInt(
                param[3].substring(param[3].indexOf("=") + 1, param[3].indexOf(","))));
        parameters.put("memoryRom", Integer.parseInt(
                param[4].substring(param[4].indexOf("=") + 1, param[4].indexOf(","))));
        parameters.put("flashMemoryCapacity", Integer.parseInt(
                param[5].substring(param[5].indexOf("=") + 1, param[5].indexOf(","))));
        parameters.put("color", param[6].substring(param[6].indexOf("=") + 1));
        return parameters;
    }

}
