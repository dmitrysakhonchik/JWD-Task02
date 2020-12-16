package by.sakhonchik.task01.service;

import by.sakhonchik.task01.entity.Appliance;
import by.sakhonchik.task01.entity.criteria.Criteria;

public interface ApplianceService {	
	
	Appliance find(Criteria criteria);
	
}
