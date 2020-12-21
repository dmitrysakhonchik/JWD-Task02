package by.sakhonchik.task01.dao.impl;

import by.sakhonchik.task01.dao.ApplianceDAO;
import by.sakhonchik.task01.entity.Appliance;
import by.sakhonchik.task01.entity.criteria.Criteria;
import by.sakhonchik.task01.entity.criteria.SearchCriteria;
import by.sakhonchik.task01.service.ApplianceTxtFileReader;

import java.io.IOException;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    public static void main(String[] args) throws IOException {

        Criteria criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());//"Oven"
        criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 45);
        criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 300);
        criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 3);


        ApplianceTxtFileReader applianceTxtFileReader =
                new ApplianceTxtFileReader("appliance-list.txt", criteriaOven);
        List<Appliance> applianceList =
                applianceTxtFileReader.getRequiredAppliancesListFromFile();
        for(Appliance appliance: applianceList)
            System.out.println(appliance);

    }

    @Override
    public Appliance find(Criteria criteria) {

        return null;
    }


}


//you may add your own new classes