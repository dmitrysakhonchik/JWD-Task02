package by.sakhonchik.task01.service.impl;

import by.sakhonchik.task01.dao.DAOFactory;
import by.sakhonchik.task01.service.validation.Validator;
import by.sakhonchik.task01.dao.ApplianceDAO;
import by.sakhonchik.task01.entity.Appliance;
import by.sakhonchik.task01.entity.criteria.Criteria;
import by.sakhonchik.task01.service.ApplianceService;

import java.io.IOException;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public List<Appliance> find(Criteria criteria) throws IOException {
        if (!Validator.criteriaValidator(criteria)) {
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        // you may add your own code here

        return applianceDAO.find(criteria);
    }

}

//you may add your own new classes
