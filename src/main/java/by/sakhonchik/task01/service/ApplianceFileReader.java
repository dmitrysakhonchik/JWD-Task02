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
        switch (param[0]) {
            case "Oven":
                String[] parameters = getOvenParameters(param);
                return applianceFactory.getAppliance(parameters, param[0]);

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


}
