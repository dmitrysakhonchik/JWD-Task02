package by.sakhonchik.task01.service;

import by.sakhonchik.task01.entity.Appliance;

import java.io.*;
import java.util.*;

public class ApplianceTxtFileReader {

    private final String pathToFile;
    private final String nameCriteria;

    public ApplianceTxtFileReader(String pathToFile, String nameCriteria) {
        this.pathToFile = pathToFile;
        this.nameCriteria = nameCriteria;
    }

    public static void main(String[] args) throws IOException {
        ApplianceTxtFileReader applianceTxtFileReader =
                new ApplianceTxtFileReader("appliance-list.txt", "VacuumCleaner");
        List<Appliance> applianceList =
                applianceTxtFileReader.getAppliancesListFromFile();
        for (Appliance appliance : applianceList)
            System.out.println(appliance);
    }


    public List<Appliance> getAppliancesListFromFile() throws IOException {
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
        Map<String, Object> mapWithParameters;
        ApplianceParser applianceParser = new ApplianceParser();
        ApplianceBuilder applianceBuilder = new ApplianceBuilder();
        String[] arrayAppliances = selectedApplianceFromFile.split(" ");

        switch (nameCriteria) {
            case "Oven":
                mapWithParameters = applianceParser.getOvenParameters(arrayAppliances);
                appliance = applianceBuilder.getBuiltAppliance(mapWithParameters);
                return appliance;
            case "Laptop":
                mapWithParameters = applianceParser.getLaptopParameters(arrayAppliances);
                return applianceBuilder.getBuiltAppliance(mapWithParameters);
            case "Refrigerator":
                mapWithParameters = applianceParser.getRefrigeratorParameters(arrayAppliances);
                return applianceBuilder.getBuiltAppliance(mapWithParameters);
            case "VacuumCleaner":
                mapWithParameters = applianceParser.getVacuumCleanerParameters(arrayAppliances);
                return applianceBuilder.getBuiltAppliance(mapWithParameters);
            case "TabletPC":
                mapWithParameters = applianceParser.getTabletPCParameters(arrayAppliances);
                return applianceBuilder.getBuiltAppliance(mapWithParameters);
            case "Speakers":
                mapWithParameters = applianceParser.getSpeakersParameters(arrayAppliances);
                return applianceBuilder.getBuiltAppliance(mapWithParameters);
            default:
                throw new IllegalArgumentException("Wrong appliance name");

        }

    }


}
