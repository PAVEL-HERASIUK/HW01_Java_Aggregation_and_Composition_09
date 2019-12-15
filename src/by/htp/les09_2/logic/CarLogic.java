package by.htp.les09_2.logic;

import by.htp.les09_2.entity.Car;
import by.htp.les09_2.entity.Wheel;

public class CarLogic {

	public boolean needGasStation(Car car) {
		if (car.getTank().getFuelBalance() <= 50) {
			return true;
		} else {
			return false;
		}
	}

	public Car gasStation(Car car) {
		if (needGasStation(car) == true) {
			car.getTank().setFuelBalance(car.getTank().getVolume());
		}
		return car;
	}

	public boolean correctWheelsNumber(Car car) {
		if (car.getWheel().size() >= 4) {
			return true;
		} else {
			return false;
		}
	}

	public boolean needWheelChange(Car car) {
		boolean value = false;
		if (correctWheelsNumber(car) == true) {
			for (int i = 0; i < car.getWheel().size(); i++) {
				if (car.getWheel().get(i).getWheelPressure() <= 0.5) {
					value = true;
					break;

				} else {
					value = false;
				}
			}
		} else
			value = true;

		return value;
	}

	public Car wheelChange(Car car) {
		if (needWheelChange(car) == true) {
			for (int i = 0; i < car.getWheel().size(); i++) {
				if (car.getWheel().get(i).getWheelPressure() <= 0.5) {
					String number = car.getWheel().get(i).getNumber();
					car.getWheel().set(i, new Wheel(number, 2.3));
				}
			}
		}
		return car;
	}

	public boolean drive(Car car) {
		if (correctWheelsNumber(car) == true & needWheelChange(car) == false & needGasStation(car) == false) {
			return true;
		} else {
			return false;
		}
	}
}
