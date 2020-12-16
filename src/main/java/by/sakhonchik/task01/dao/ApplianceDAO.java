package by.sakhonchik.task01.dao;

import by.sakhonchik.task01.entity.Appliance;
import by.sakhonchik.task01.entity.criteria.Criteria;

import java.io.IOException;

public interface ApplianceDAO {
	Appliance find(Criteria criteria) throws IOException;
}
