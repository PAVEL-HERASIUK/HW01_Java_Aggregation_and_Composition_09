package by.htp.les09_3.view;

import by.htp.les09_3.entity.District;
import by.htp.les09_3.entity.State;
import by.htp.les09_3.logic.StateLogic;

public class ViewPrint {
	int i, j, k;

	public void printStateName(State i, State j, State k) {
		System.out.println(i.getNameState() + " площадь " + j.findAreaCitiesState(i) + " кв.м. "
				+ ", количество областей в государстве = " + k.numberRegions(i) + " шт.");
	}

	public void printRegionalCenter(District k, State i) {
		System.out.println(i.findRegionalCenter(j) + "  ");
	}
}
