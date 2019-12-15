package by.htp.les09_3.entity;

import java.util.ArrayList;
import java.util.List;

public class District {
	private String nameDistrict;
	private List<City> cities;

	public District(String nameDistrict) {
		this.nameDistrict = nameDistrict;
		this.cities = new ArrayList<City>();
	}

	public District(String nameDistrict, List<City> cities) {
		this.nameDistrict = nameDistrict;
		this.cities = new ArrayList<City>();
	}

	public String getNameDistrict() {
		return nameDistrict;
	}

	public void setNameDistrict(String nameDistrict) {
		this.nameDistrict = nameDistrict;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cities == null) ? 0 : cities.hashCode());
		result = prime * result + ((nameDistrict == null) ? 0 : nameDistrict.hashCode());
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
		District other = (District) obj;
		if (cities == null) {
			if (other.cities != null)
				return false;
		} else if (!cities.equals(other.cities))
			return false;
		if (nameDistrict == null) {
			if (other.nameDistrict != null)
				return false;
		} else if (!nameDistrict.equals(other.nameDistrict))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "District [nameDistrict=" + nameDistrict + ", cities=" + cities + "]";
	}
}
