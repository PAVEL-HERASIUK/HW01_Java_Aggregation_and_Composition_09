package by.htp.les09_2.view;

import by.htp.les09_2.entity.Car;
import by.htp.les09_2.logic.CarLogic;

public class CarView {

	CarLogic carLogic = new CarLogic();

	public void printCar(Car car) {
		System.out.println(car);
	}
}
