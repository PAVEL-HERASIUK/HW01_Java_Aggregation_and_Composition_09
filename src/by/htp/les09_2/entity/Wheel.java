package by.htp.les09_2.entity;

public class Wheel {

	private String number;
	private double wheelPressure;

	public Wheel() {
		this.number = " ";
		this.wheelPressure = 0;
	}

	public Wheel(String number, double wheelPressure) {
		this.number = number;
		this.wheelPressure = wheelPressure;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getWheelPressure() {
		return wheelPressure;
	}

	public void setWheelPressure(double wheelPressure) {
		this.wheelPressure = wheelPressure;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		long temp;
		temp = Double.doubleToLongBits(wheelPressure);
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
		Wheel other = (Wheel) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (Double.doubleToLongBits(wheelPressure) != Double.doubleToLongBits(other.wheelPressure))
			return false;
		return true;
	}
}
