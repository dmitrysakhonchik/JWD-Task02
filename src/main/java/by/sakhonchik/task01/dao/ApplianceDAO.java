package by.sakhonchik.task01.dao;

import by.sakhonchik.task01.entity.Appliance;
import by.sakhonchik.task01.entity.criteria.Criteria;

public interface ApplianceDAO {
	Appliance find(Criteria criteria);
}
