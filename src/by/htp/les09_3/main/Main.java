package by.htp.les09_3.main;

import  by.htp.les09_3.entity.State;
import  by.htp.les09_3.entity.District;
import  by.htp.les09_3.entity.Region;

import java.util.List;

import  by.htp.les09_3.entity.City;
import  by.htp.les09_3.logic.StateLogic;
import  by.htp.les09_3.view.StateView;

public class Main {
	 // Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
	
	public static void main(String[] args, Object state, Object see) {
		
		List<District> GrodnoRegion = new ArrayList<>();
		
		GrodnoRegion.add(new District(" Гродненский ", new City(" Скидель ")));
		GrodnoRegion.add(new District(" Свислочский ", new City(" Свислочь")));
	
		List<District> BrestRegion = new ArrayList<>();
		
		BrestRegion.add(new District(" Коринский ", new City(" Кобрин ")));
		BrestRegion.add(new District(" Беловежский ", new City(" Беловежск ")));
		
		state.setRegions(REGION1);
		state.setRegion(REGION2);

		StateLogic logic = new StateLogic();
		State view = new State(null);

		see.printCapital(state);
		see.printSquare(state);
		see.printNumberOfRegions(state, logic.stateRegions(state));
		see.printRegionCenters(state);
	}
}
