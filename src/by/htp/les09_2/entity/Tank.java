package by.htp.les09_2.entity;

public class Tank {
	private double volume;
	private double fuelBalance;
	private String fuelType;

	public Tank() {
		this.volume = 0;
		this.fuelBalance = 0;
		this.fuelType = " ";
	}

	public Tank(double volume, double fuelBalance, String fuelType) {
		this.volume = volume;
		this.fuelType = fuelType;
		this.fuelBalance = fuelBalance;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getFuelBalance() {
		return fuelBalance;
	}

	public void setFuelBalance(double fuelBalance) {
		this.fuelBalance = fuelBalance;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(fuelBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((fuelType == null) ? 0 : fuelType.hashCode());
		temp = Double.doubleToLongBits(volume);
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
		Tank other = (Tank) obj;
		if (Double.doubleToLongBits(fuelBalance) != Double.doubleToLongBits(other.fuelBalance))
			return false;
		if (fuelType == null) {
			if (other.fuelType != null)
				return false;
		} else if (!fuelType.equals(other.fuelType))
			return false;
		if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume))
			return false;
		return true;
	}
}
