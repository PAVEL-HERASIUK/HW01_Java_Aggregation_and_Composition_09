package by.htp.les09_2.entity;

public class Engine {
	private int cylindersNumber;
	private double engineVolume;
	private double powerEngine;

	public Engine() {
		this.cylindersNumber = 0;
		this.engineVolume = 0;
		this.powerEngine = 0;
	}

	public Engine(int cylindersNumber, double engineVolume, double powerEngine) {
		this.cylindersNumber = cylindersNumber;
		this.engineVolume = engineVolume;
		this.powerEngine = 400;
	}

	public int getCylindersNumber() {
		return cylindersNumber;
	}

	public void setCylindersNumber(int cylindersNumber) {
		this.cylindersNumber = cylindersNumber;
	}

	public double getEngineVolume() {
		return engineVolume;
	}

	public void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}

	public double getPowerEngine() {
		return powerEngine;
	}

	public void setPowerEngine(double powerEngine) {
		this.powerEngine = powerEngine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cylindersNumber;
		long temp;
		temp = Double.doubleToLongBits(engineVolume);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(powerEngine);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Engine other = (Engine) obj;
		if (cylindersNumber != other.cylindersNumber)
			return false;
		if (Double.doubleToLongBits(engineVolume) != Double.doubleToLongBits(other.engineVolume))
			return false;
		if (Double.doubleToLongBits(powerEngine) != Double.doubleToLongBits(other.powerEngine))
			return false;
		return true;
	}
}
