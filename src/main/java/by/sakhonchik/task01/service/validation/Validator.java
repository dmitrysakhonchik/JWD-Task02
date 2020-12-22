package by.sakhonchik.task01.service.validation;

import by.sakhonchik.task01.entity.criteria.Criteria;

import java.util.Map;

public class Validator {


    public static boolean criteriaValidator(Criteria criteria) {
        Map<String, Object> criteriaMap = criteria.getCriteria();
        return !criteriaMap.isEmpty();
    }




}

//you may add your own new classes