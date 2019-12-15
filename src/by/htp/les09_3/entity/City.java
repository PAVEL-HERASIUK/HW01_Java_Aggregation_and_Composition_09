package by.htp.les09_3.entity;

public class City {

	private String name;
	private double cityArea;
	boolean regionalCenter;
	boolean capital;

	public City(String name, double cityArea, boolean regionalCenter, boolean capital) {
		super();
		this.name = name;
		this.cityArea = cityArea;
		this.regionalCenter = regionalCenter;
		this.capital = capital;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCityArea() {
		return cityArea;
	}

	public void setCityArea(double cityArea) {
		this.cityArea = cityArea;
	}

	public boolean isRegionalCenter() {
		return regionalCenter;
	}

	public void setRegionalCenter(boolean regionalCenter) {
		this.regionalCenter = regionalCenter;
	}

	public boolean isCapital() {
		return capital;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (capital ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(cityArea);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (regionalCenter ? 1231 : 1237);
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
		City other = (City) obj;
		if (capital != other.capital)
			return false;
		if (Double.doubleToLongBits(cityArea) != Double.doubleToLongBits(other.cityArea))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regionalCenter != other.regionalCenter)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", cityArea=" + cityArea + ", regionalCenter=" + regionalCenter + ", capital="
				+ capital + "]";
	}
}
