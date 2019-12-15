package by.htp.les09_5.view;

import java.util.List;

import by.htp.les09_5.entity.Tour;

public class TourCompanyView {

	public void printTours(List<Tour> tours) {

		for (Tour i : tours) {
			System.out.println(i);
		}
	}
}
