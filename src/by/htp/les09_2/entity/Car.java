package by.htp.les09_2.entity;

import java.util.ArrayList;
import java.util.List;

public class Car {

	// 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
	// Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.

	private int year;
	private String model;
	private List<Wheel> wheel;
	private Tank tank;
	private Engine engine;

	public Car() {
		this.model = " ";
		this.year = 2014;
		this.wheel = new ArrayList<Wheel>();
		this.tank = new Tank();
		this.engine = new Engine();
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<Wheel> getWheel() {
		return wheel;
	}

	public void setWheel(List<Wheel> wheel) {
		this.wheel = wheel;
	}

	public Tank getTank() {
		return tank;
	}

	public void setTank(Tank tank) {
		this.tank = tank;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Car(String model, int year) {
		this.model = model;
		this.year = year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((tank == null) ? 0 : tank.hashCode());
		result = prime * result + ((wheel == null) ? 0 : wheel.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (tank == null) {
			if (other.tank != null)
				return false;
		} else if (!tank.equals(other.tank))
			return false;
		if (wheel == null) {
			if (other.wheel != null)
				return false;
		} else if (!wheel.equals(other.wheel))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
}
