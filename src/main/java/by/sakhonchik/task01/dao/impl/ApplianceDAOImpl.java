package by.sakhonchik.task01.dao.impl;

import by.sakhonchik.task01.dao.ApplianceDAO;
import by.sakhonchik.task01.entity.Appliance;
import by.sakhonchik.task01.entity.Oven;
import by.sakhonchik.task01.entity.criteria.Criteria;
import by.sakhonchik.task01.entity.criteria.SearchCriteria;
import by.sakhonchik.task01.service.ApplianceTxtFileReader;

import java.io.IOException;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    public static void main(String[] args) throws IOException {

        Criteria criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());//"Oven"
        criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 200);
        criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 300);


        ApplianceTxtFileReader applianceTxtFileReader =
                new ApplianceTxtFileReader("appliance-list.txt", "Laptop");
        List<Appliance> applianceList =
                applianceTxtFileReader.getRequiredAppliancesListFromFile();
        for (Appliance appliance : applianceList) {

            System.out.println(appliance.getOs());

        }


    }

    @Override
    public Appliance find(Criteria criteria) {

        return null;
    }


}


//you may add your own new classes