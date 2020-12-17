package by.sakhonchik.task01.dao.impl;

import by.sakhonchik.task01.dao.ApplianceDAO;
import by.sakhonchik.task01.entity.Appliance;
import by.sakhonchik.task01.entity.criteria.Criteria;
import by.sakhonchik.task01.service.ApplianceFileReader;

import java.io.IOException;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {
    ApplianceFileReader applianceFileReader;


    @Override
    public Appliance find(Criteria criteria) throws IOException {

        return null;
    }

    // you may add your own code here

}


//you may add your own new classes