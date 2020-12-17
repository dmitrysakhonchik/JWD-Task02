package by.sakhonchik.task01.service;

import by.sakhonchik.task01.entity.Appliance;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ApplianceFileReader {
    ApplianceFactory applianceFactory;


    public List<Appliance> getApplianceListFromFile(String pathToFile, String nameCriteria) throws IOException {
        List<Appliance> applianceList = new ArrayList<>();
        File initialFile = new File(pathToFile);
        InputStream targetStream = new FileInputStream(initialFile);
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader =
                     new BufferedReader(new InputStreamReader(targetStream))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith(nameCriteria)) {
                    Appliance appliance = getAppliance(line);
                    applianceList.add(appliance);
                }
            }
        }
        return applianceList;
    }

    private Appliance getAppliance(String info) {
        String[] param = info.split(" ");
        String[] parameters;
        switch (param[0]) {
            case "Oven":
                parameters = getOvenParameters(param);
                return applianceFactory.getAppliance(parameters, param[0]);
            case "Laptop":
                parameters = getLaptopParameters(param);
                return applianceFactory.getAppliance(parameters, param[0]);
            case "Refrigerator":
                parameters = getRefrigeratorParameters(param);
                return applianceFactory.getAppliance(parameters, param[0]);
            case "VacuumCleaner":
                parameters = getVacuumCleanerParameters(param);
                return applianceFactory.getAppliance(parameters, param[0]);
            case "TabletPC":
                parameters = getTabletPCParameters(param);
                return applianceFactory.getAppliance(parameters, param[0]);
            case "Speakers":
                parameters = getSpeakersParameters(param);
                return applianceFactory.getAppliance(parameters, param[0]);
            default:
                return null;

        }

    }

    private String[] getOvenParameters(String[] param) {
        String[] parameters = new String[6];
        parameters[0] = param[2].substring(param[2].indexOf("="), param[2].indexOf(","));
        parameters[1] = param[3].substring(param[3].indexOf("="), param[3].indexOf(","));
        parameters[2] = param[4].substring(param[4].indexOf("="), param[4].indexOf(","));
        parameters[3] = param[5].substring(param[5].indexOf("="), param[5].indexOf(","));
        parameters[4] = param[6].substring(param[6].indexOf("="), param[6].indexOf(","));
        parameters[5] = param[7].substring(param[7].indexOf("="), param[7].indexOf(" "));
        return parameters;
    }

    private String[] getLaptopParameters(String[] param) {
        String[] parameters = new String[6];
        parameters[0] = param[2].substring(param[2].indexOf("="), param[2].indexOf(","));
        parameters[1] = param[3].substring(param[3].indexOf("="), param[3].indexOf(","));
        parameters[2] = param[4].substring(param[4].indexOf("="), param[4].indexOf(","));
        parameters[3] = param[5].substring(param[5].indexOf("="), param[5].indexOf(","));
        parameters[4] = param[6].substring(param[6].indexOf("="), param[6].indexOf(","));
        parameters[5] = param[7].substring(param[7].indexOf("="), param[7].indexOf(" "));
        return parameters;
    }

    private String[] getRefrigeratorParameters(String[] param) {
        String[] parameters = new String[6];
        parameters[0] = param[2].substring(param[2].indexOf("="), param[2].indexOf(","));
        parameters[1] = param[3].substring(param[3].indexOf("="), param[3].indexOf(","));
        parameters[2] = param[4].substring(param[4].indexOf("="), param[4].indexOf(","));
        parameters[3] = param[5].substring(param[5].indexOf("="), param[5].indexOf(","));
        parameters[4] = param[6].substring(param[6].indexOf("="), param[6].indexOf(","));
        parameters[5] = param[7].substring(param[7].indexOf("="), param[7].indexOf(" "));
        return parameters;
    }

    private String[] getVacuumCleanerParameters(String[] param) {
        String[] parameters = new String[6];
        parameters[0] = param[2].substring(param[2].indexOf("="), param[2].indexOf(","));
        parameters[1] = param[3].substring(param[3].indexOf("="), param[3].indexOf(","));
        parameters[2] = param[4].substring(param[4].indexOf("="), param[4].indexOf(","));
        parameters[3] = param[5].substring(param[5].indexOf("="), param[5].indexOf(","));
        parameters[4] = param[6].substring(param[6].indexOf("="), param[6].indexOf(","));
        parameters[5] = param[7].substring(param[7].indexOf("="), param[7].indexOf(" "));
        return parameters;
    }

    private String[] getSpeakersParameters(String[] param) {
        String[] parameters = new String[6];
        parameters[0] = param[2].substring(param[2].indexOf("="), param[2].indexOf(","));
        parameters[1] = param[3].substring(param[3].indexOf("="), param[3].indexOf(","));
        parameters[2] = param[4].substring(param[4].indexOf("="), param[4].indexOf(","));
        parameters[3] = param[5].substring(param[5].indexOf("="), param[5].indexOf(","));
        parameters[4] = param[6].substring(param[6].indexOf("="), param[6].indexOf(","));
        parameters[5] = param[7].substring(param[7].indexOf("="), param[7].indexOf(" "));
        return parameters;
    }

    private String[] getTabletPCParameters(String[] param) {
        String[] parameters = new String[6];
        parameters[0] = param[2].substring(param[2].indexOf("="), param[2].indexOf(","));
        parameters[1] = param[3].substring(param[3].indexOf("="), param[3].indexOf(","));
        parameters[2] = param[4].substring(param[4].indexOf("="), param[4].indexOf(","));
        parameters[3] = param[5].substring(param[5].indexOf("="), param[5].indexOf(","));
        parameters[4] = param[6].substring(param[6].indexOf("="), param[6].indexOf(","));
        parameters[5] = param[7].substring(param[7].indexOf("="), param[7].indexOf(" "));
        return parameters;
    }


}
