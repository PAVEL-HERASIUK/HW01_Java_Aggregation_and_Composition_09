package by.htp.les09_3.logic;

import by.htp.les09_3.entity.City;
import by.htp.les09_3.entity.District;
import by.htp.les09_3.entity.Region;
import by.htp.les09_3.entity.State;

public class StateLogic {

	public double findAreaCitysDistrict(District district) {
		double sum = 0;
		for (City i : district.getCities()) {
			sum = sum + i.getCityArea();
		}
		return sum;
	}

	public double findAreaCitysRegion(Region region) {
		double sum = 0;
		for (District i : region.getDistricts()) {
			sum = sum + findAreaCitysDistrict(i);
		}
		return sum;
	}

	public int numberRegions(State state) {
		int counter = 0;
		return counter;
	}

	public String findCityRegionalCenters(District district) {
		String j = null;
		for (City i : district.getCities()) {
			if (i.isRegionalCenter() == true) {
				j = i.getName();
			}
		}
		return j;
	}
}
