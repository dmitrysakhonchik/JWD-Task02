package by.sakhonchik.task01.dao.impl;

import by.sakhonchik.task01.dao.ApplianceDAO;
import by.sakhonchik.task01.entity.Appliance;
import by.sakhonchik.task01.entity.criteria.Criteria;
import by.sakhonchik.task01.service.ApplianceFactory;
import by.sakhonchik.task01.service.ApplianceReader;

import java.io.IOException;

public class ApplianceDAOImpl implements ApplianceDAO {
    ApplianceReader applianceReader;
    ApplianceFactory applianceFactory;

    @Override
    public Appliance find(Criteria criteria) throws IOException {
        String fileData = applianceReader.readFromFile("appliance-list.txt");



        return null;
    }

    // you may add your own code here

}


//you may add your own new classes