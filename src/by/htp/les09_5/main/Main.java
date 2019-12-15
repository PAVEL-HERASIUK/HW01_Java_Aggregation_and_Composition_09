package by.htp.les09_5.main;

import by.htp.les09_5.entity.Food;
import by.htp.les09_5.entity.Tour;
import by.htp.les09_5.entity.TourCompany;
import by.htp.les09_5.entity.TourType;
import by.htp.les09_5.logic.TourCompanyLogic;
import by.htp.les09_5.view.TourCompanyView;
import by.htp.les09_5.entity.Transport;

public class Main {
	
	public static void main (String[] args, TourCompanyView see) {

		TourCompany tourCompany = new TourCompany(" Алатан тур ");
		
		tourCompany.setTours(new Tour(" Ukraine ", " Kiev " , " 01.12.2019 " , 7 , Transport.air, Food.FB, Tour.excursions));
		tourCompany.setTours(new Tour(" Ukraine ", " Odessa " , " 02.01.2020 ", 8 , Transport.bus, Food.HB, Tour.shopping));
		tourCompany.setTours(new Tour(" Lithuania ", " Vilnius " , " 03.04.2020 " , 9 , Transport.ship, Food.BB, Tour.treatment));
						
		TourCompanyLogic find = new TourCompanyLogic ();

		TourCompanyView view = new TourCompanyView();
		see.printTours(find.findTypeOfTransportTypeFoodDays (tourCompany, Transport.air, Food.FB, 9));
	}
}
