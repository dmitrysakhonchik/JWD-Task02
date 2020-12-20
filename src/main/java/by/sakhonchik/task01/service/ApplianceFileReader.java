package by.sakhonchik.task01.service;

import by.sakhonchik.task01.entity.Appliance;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ApplianceFileReader {

    public static void main(String[] args) throws IOException {
        ApplianceFileReader applianceFileReader = new ApplianceFileReader();
        List<Appliance> applianceList =
                applianceFileReader.getAppliancesListFromFile("appliance-list.txt", "Refrigerator");
        for (Appliance appliance : applianceList)
            System.out.println(appliance);
    }


    public List<Appliance> getAppliancesListFromFile(String pathToFile, String nameCriteria) throws IOException {
        List<Appliance> appliances = new ArrayList<>();
        File fileWithAppliances = new File(pathToFile);
        InputStream inputStream = new FileInputStream(fileWithAppliances);
        try (BufferedReader bufferedReader =
                     new BufferedReader(new InputStreamReader(inputStream))) {
            String lineFromFile;
            while ((lineFromFile = bufferedReader.readLine()) != null) {
                if (lineFromFile.startsWith(nameCriteria)) {
                    Appliance newApplianceFromFile = getAppliance(lineFromFile);
                    appliances.add(newApplianceFromFile);
                }
            }
        }
        return appliances;
    }

    private Appliance getAppliance(String selectedApplianceFromFile) {
        Appliance appliance;
        String[] parameters;
        ApplianceFactory applianceFactory = new ApplianceFactory();
        String[] arrayAppliances = selectedApplianceFromFile.split(" ");
        String applianceName = arrayAppliances[0];

        switch (applianceName) {
            case "Oven":
                parameters = getOvenParameters(arrayAppliances);
                appliance = applianceFactory.getBuiltAppliance(parameters, applianceName);
                return appliance;
            case "Laptop":
                parameters = getLaptopParameters(arrayAppliances);
                return applianceFactory.getBuiltAppliance(parameters, applianceName);
            case "Refrigerator":
                parameters = getRefrigeratorParameters(arrayAppliances);
                return applianceFactory.getBuiltAppliance(parameters, applianceName);
            case "VacuumCleaner":
                parameters = getVacuumCleanerParameters(arrayAppliances);
                return applianceFactory.getBuiltAppliance(parameters, applianceName);
            case "TabletPC":
                parameters = getTabletPCParameters(arrayAppliances);
                return applianceFactory.getBuiltAppliance(parameters, applianceName);
            case "Speakers":
                parameters = getSpeakersParameters(arrayAppliances);
                return applianceFactory.getBuiltAppliance(parameters, applianceName);
            default:
                throw new IllegalArgumentException("Wrong appliance name");

        }

    }

    private String[] getOvenParameters(String[] param) {
        String[] parameters = new String[6];
        parameters[0] = param[2].substring(param[2].indexOf("=") + 1, param[2].indexOf(","));
        parameters[1] = param[3].substring(param[3].indexOf("=") + 1, param[3].indexOf(","));
        parameters[2] = param[4].substring(param[4].indexOf("=") + 1, param[4].indexOf(","));
        parameters[3] = param[5].substring(param[5].indexOf("=") + 1, param[5].indexOf(","));
        parameters[4] = param[6].substring(param[6].indexOf("=") + 1, param[6].indexOf(","));
        parameters[5] = param[7].substring(param[7].indexOf("=") + 1);
        return parameters;
    }

    private String[] getLaptopParameters(String[] param) {
        String[] parameters = new String[6];
        parameters[0] = param[2].substring(param[2].indexOf("=") + 1, param[2].indexOf(","));
        parameters[1] = param[3].substring(param[3].indexOf("=") + 1, param[3].indexOf(","));
        parameters[2] = param[4].substring(param[4].indexOf("=") + 1, param[4].indexOf(","));
        parameters[3] = param[5].substring(param[5].indexOf("=") + 1, param[5].indexOf(","));
        parameters[4] = param[6].substring(param[6].indexOf("=") + 1, param[6].indexOf(","));
        parameters[5] = param[7].substring(param[7].indexOf("=") + 1);
        return parameters;
    }

    private String[] getRefrigeratorParameters(String[] param) {
        String[] parameters = new String[6];
        parameters[0] = param[2].substring(param[2].indexOf("=") + 1, param[2].indexOf(","));
        parameters[1] = param[3].substring(param[3].indexOf("=") + 1, param[3].indexOf(","));
        parameters[2] = param[4].substring(param[4].indexOf("=") + 1, param[4].indexOf(","));
        parameters[3] = param[5].substring(param[5].indexOf("=") + 1, param[5].indexOf(","));
        parameters[4] = param[6].substring(param[6].indexOf("=") + 1, param[6].indexOf(","));
        parameters[5] = param[7].substring(param[7].indexOf("=") + 1);
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
