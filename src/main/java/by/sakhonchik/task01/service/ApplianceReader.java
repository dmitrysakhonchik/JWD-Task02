package by.sakhonchik.task01.service;

import java.io.*;

public class ApplianceReader {


    public String readFromFile(String pathToFile) throws IOException {
        String nameCriteria = "TabletPC";
        File initialFile = new File(pathToFile);
        InputStream targetStream = new FileInputStream(initialFile);
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(targetStream))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith(nameCriteria)) {
                    resultStringBuilder.append(line).append("\n");
                }
            }
        }
        return resultStringBuilder.toString();
    }


    public static void main(String[] args) throws IOException {
        ApplianceReader applianceReader = new ApplianceReader();
        String a = applianceReader.readFromFile("appliance-list.txt");
        System.out.println(a);
        String[] strings = a.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }

    }


}
