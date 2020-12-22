package by.sakhonchik.task01.dao.impl;

import by.sakhonchik.task01.dao.ApplianceDAO;
import by.sakhonchik.task01.entity.Appliance;
import by.sakhonchik.task01.entity.criteria.Criteria;
import by.sakhonchik.task01.service.reader.ApplianceTxtFileReader;

import java.io.IOException;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public List<Appliance> find(Criteria criteria) throws IOException {
        ApplianceTxtFileReader applianceTxtFileReader =
                new ApplianceTxtFileReader("appliance-list.txt", criteria);
        return applianceTxtFileReader.getRequiredAppliancesListFromFile();
    }


}


//you may add your own new classes