package by.htp.les09_5.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.les09_5.entity.Tour;
import by.htp.les09_5.entity.TourCompany;
import by.htp.les09_5.entity.Food;
import by.htp.les09_5.entity.Transport;

public class TourCompanyLogic {

	public List<Tour> findTypeOfTransportTypeFoodDays(TourCompany tourCompany, Transport typeOfTransport, Food typeFood,
			int days) {
		List<Tour> findTours = new ArrayList<Tour>();
		List<Tour> tours = TourCompany.getTour();

		for (Tour i : tours) {
			if (i.getTypeOfTransport().compareTo(typeOfTransport) == 0 && i.getTypeFood().compareTo(typeFood) == 0
					&& i.getDays() == days) {

				findTours.add(i);
			}
		}
		return findTours;
	}
}
