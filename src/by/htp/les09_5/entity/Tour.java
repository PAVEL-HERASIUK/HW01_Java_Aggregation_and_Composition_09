package by.htp.les09_5.entity;

public class Tour {

	private String countrty;
	private String resortName;
	private String startDate;
	private int day;
	private String typeOfTransport;
	private String typeFood;
	private String typeTour;

	public void tour(String countrty, String resortName, String startDate, int day, String typeOfTransport,
			String typeFood, String typeTour) {

		this.countrty = countrty;
		this.resortName = resortName;
		this.startDate = startDate;
		this.day = day;
		this.typeOfTransport = typeOfTransport;
		this.typeFood = typeFood;
		this.typeTour = typeTour;
	}

	public String getCountrty() {
		return countrty;
	}

	public void setCountrty(String countrty) {
		this.countrty = countrty;
	}

	public String getEsort() {
		return resortName;
	}

	public void setEsort(String esort) {
		this.resortName = resortName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getTypeOfTransport() {
		return typeOfTransport;
	}

	public void setTypeOfTransport(String typeOfTransport) {
		this.typeOfTransport = typeOfTransport;
	}

	public String getTypeFood() {
		return typeFood;
	}

	public void setTypeFood(String typeFood) {
		this.typeFood = typeFood;
	}

	public String getTypeTour() {
		return typeTour;
	}

	public void setTypeTour(String typeTour) {
		this.typeTour = typeTour;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countrty == null) ? 0 : countrty.hashCode());
		result = prime * result + day;
		result = prime * result + ((resortName == null) ? 0 : resortName.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((typeFood == null) ? 0 : typeFood.hashCode());
		result = prime * result + ((typeOfTransport == null) ? 0 : typeOfTransport.hashCode());
		result = prime * result + ((typeTour == null) ? 0 : typeTour.hashCode());
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
		Tour other = (Tour) obj;
		if (countrty == null) {
			if (other.countrty != null)
				return false;
		} else if (!countrty.equals(other.countrty))
			return false;
		if (day != other.day)
			return false;
		if (resortName == null) {
			if (other.resortName != null)
				return false;
		} else if (!resortName.equals(other.resortName))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (typeFood == null) {
			if (other.typeFood != null)
				return false;
		} else if (!typeFood.equals(other.typeFood))
			return false;
		if (typeOfTransport == null) {
			if (other.typeOfTransport != null)
				return false;
		} else if (!typeOfTransport.equals(other.typeOfTransport))
			return false;
		if (typeTour == null) {
			if (other.typeTour != null)
				return false;
		} else if (!typeTour.equals(other.typeTour))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tour [countrty=" + countrty + ", resortName=" + resortName + ", startDate=" + startDate + ", day=" + day
				+ ", typeOfTransport=" + typeOfTransport + ", typeFood=" + typeFood + ", typeTour=" + typeTour + "]";
	}
}
