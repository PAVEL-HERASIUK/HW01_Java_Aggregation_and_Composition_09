package by.htp.les09_3.entity;

import java.util.ArrayList;
import java.util.List;

public class State {
	// 3. Создать объект класса Государство, используя классы Область, Район, Город.
	// Методы: вывести на консоль столицу, количество областей, площадь, областные
	// центры.

	private String nameState;
	private List<Region> region;
	private City city;

	public State(String nameState, List<Region> region) {
		this.nameState = nameState;
		this.region = new ArrayList<Region>();
	}

	public State(String nameState) {
		this.nameState = nameState;
		this.region = new ArrayList<Region>();
	}

	public String getNameState() {
		return nameState;
	}

	public void setNameState(String nameState) {
		this.nameState = nameState;
	}

	public List<Region> getRegion() {
		return region;
	}

	public void setRegion(List<Region> region) {
		this.region = region;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameState == null) ? 0 : nameState.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
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
		State other = (State) obj;
		if (nameState == null) {
			if (other.nameState != null)
				return false;
		} else if (!nameState.equals(other.nameState))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		return true;
	}
}
