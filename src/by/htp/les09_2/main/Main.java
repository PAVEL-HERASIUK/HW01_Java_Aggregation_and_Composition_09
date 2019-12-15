package by.htp.les09_2.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.les09_2.entity.Car;
import by.htp.les09_2.entity.Engine;
import by.htp.les09_2.entity.Tank;
import by.htp.les09_2.entity.Wheel;
import by.htp.les09_2.logic.CarLogic;
import by.htp.les09_2.view.CarView;

	public class Main {

		List<Wheel> wheels = new ArrayList<Wheel>();
	
		wheel.add(new  Wheel(" переднее левое ", 1.6));
		wheel.add(new  Wheel(" переднее правое ", 1.7));
		wheel.add(new  Wheel(" заднее правое ", 1.8));
		wheel.add(new  Wheel(" заднее левое ", 2.03));
			
		Engine engine = new Engine(4, 1.6, 400);
		Tank tank = new Tank ( 80 , 92, " 95");
		Car car = new Car( "A6 ", 2014);
		CarLogic carLogic = new CarLogic();
		CarView carView = new CarView();
	
		car.setWheel(wheel);
		car.setTank(tank);
		car.setEngine(engine);
}
