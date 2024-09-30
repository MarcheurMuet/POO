package fr.fms.entities;

public class Capital extends City {
	
	static String monument;
	Object City = getCity();
	
	public Capital(String monument, String name, String country, int people) {
		super(name, country, people);
		Capital.monument = monument;
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public void setmonument(String monument) {
		// TODO Auto-generated method stub
		Capital.monument = monument;
	}
	
	public String getmonument() {
		// TODO Auto-generated method stub
		return monument;
	}
	
	public Object getCity() {
		return City;
	}

	public void setCity(City city) {
		this.City = city;
	}
	
	public String toString() {
		return     getmonument() +", "+ getname() + ", "+getcountry()+", "+ getpeople() +".";
	}
}
