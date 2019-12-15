package by.htp.les09_3.entity;

import java.util.ArrayList;
import java.util.List;

public class Region {

	private String name;
	private List<District> districts;

	public Region(String name) {
		this.name = name;
		this.districts = new ArrayList<District>();
	}

	public Region(String name, List<District> districts) {
		this.name = name;
		this.districts = new ArrayList<District>();
	}

	@Override
	public String toString() {
		return "Region [name=" + name + ", districts=" + districts + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Region other = (Region) obj;
		if (districts == null) {
			if (other.districts != null)
				return false;
		} else if (!districts.equals(other.districts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
