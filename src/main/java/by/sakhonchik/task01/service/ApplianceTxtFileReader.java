package by.sakhonchik.task01.service;

import by.sakhonchik.task01.entity.Appliance;
import by.sakhonchik.task01.entity.criteria.Criteria;

import java.io.*;
import java.util.*;

public class ApplianceTxtFileReader {

    private final String pathToFile;
    private final Criteria criteria;

    public ApplianceTxtFileReader(String pathToFile, Criteria criteria) {
        this.pathToFile = pathToFile;
        this.criteria = criteria;
    }

    public List<Appliance> getRequiredAppliancesListFromFile() throws IOException {
        List<Appliance> appliances = new ArrayList<>();
        File fileWithAppliances = new File(pathToFile);
        InputStream inputStream = new FileInputStream(fileWithAppliances);
        try (BufferedReader bufferedReader =
                     new BufferedReader(new InputStreamReader(inputStream))) {
            String lineFromFile;
            while ((lineFromFile = bufferedReader.readLine()) != null) {
                if (lineFromFile.startsWith(criteria.getGroupSearchName())) {
                    if (parametersExistInLine(lineFromFile, criteria)) {
                        Appliance newApplianceFromFile = getAppliance(lineFromFile);
                        appliances.add(newApplianceFromFile);
                    }
                }
            }
        }
        return appliances;
    }

    private boolean parametersExistInLine(String lineWithParameters, Criteria criteria) {
        ApplianceParser applianceParser = new ApplianceParser();
        String[] parametersApplianceArray = lineWithParameters.split(" ");
        Map<String, Object> criteriaMap = criteria.getCriteria();
        Map<String, Object> mapWithParameters = applianceParser.getOvenParameters(parametersApplianceArray);

        for (Map.Entry<String, Object> mapFromCriteria : criteriaMap.entrySet()) {
            for (Map.Entry<String, Object> mapFromLine : mapWithParameters.entrySet()) {
                if (mapFromCriteria.getKey().equalsIgnoreCase(mapFromLine.getKey()) &&
                        mapFromCriteria.getValue().equals(mapFromLine.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }


    private Appliance getAppliance(String selectedApplianceFromFile) {
        Appliance appliance;
        Map<String, Object> mapWithParameters;
        ApplianceParser applianceParser = new ApplianceParser();
        ApplianceBuilder applianceBuilder = new ApplianceBuilder();
        String[] arrayAppliances = selectedApplianceFromFile.split(" ");
        switch (criteria.getGroupSearchName()) {
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
