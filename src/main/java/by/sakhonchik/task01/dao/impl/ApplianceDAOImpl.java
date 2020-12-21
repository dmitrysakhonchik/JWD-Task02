package by.sakhonchik.task01.dao.impl;

import by.sakhonchik.task01.dao.ApplianceDAO;
import by.sakhonchik.task01.entity.Appliance;
import by.sakhonchik.task01.entity.criteria.Criteria;
import by.sakhonchik.task01.service.ApplianceTxtFileReader;

import java.io.IOException;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    public static void main(String[] args) throws IOException {
        ApplianceTxtFileReader applianceTxtFileReader =
                new ApplianceTxtFileReader("appliance-list.txt", "VacuumCleaner");
        List<Appliance> applianceList =
                applianceTxtFileReader.getAppliancesListFromFile();

        for (Appliance appliance : applianceList)
            System.out.println(appliance);

    }

    @Override
    public Appliance find(Criteria criteria) {

        return null;
    }

    // you may add your own code here

}


//you may add your own new classes