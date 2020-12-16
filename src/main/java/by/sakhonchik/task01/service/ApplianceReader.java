package by.sakhonchik.task01.service;

import java.io.*;

public class ApplianceReader {


    public String readFromFile(String pathToFile)
            throws IOException {
        File initialFile = new File(pathToFile);
        InputStream targetStream = new FileInputStream(initialFile);
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(targetStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();

    }








}
