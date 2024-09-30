package fr.fms.entities;

public class City {

	public String name;
	static String country;
	static int people;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public City(String name, String country, int people) {
		this.name = name;
		City.country = country;
		City.people = people;
	}

	public String getname() {
		return name;
	}
	public void setname(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	public void setcountry(String country) {
		// TODO Auto-generated method stub
		City.country = country;
	}
	
	public String getcountry() {
		// TODO Auto-generated method stub
		return country;
	}
	
	public void setpeople(int people) {
		// TODO Auto-generated method stub
		if (people <= 0)
			throw new RuntimeException("Le nombre d'habitant doit être positif!");
		City.people = people;
	}
	
	public int getpeople() {
		// TODO Auto-generated method stub
		return people;
	}
	
	public String toString() {
		return getname() + getpeople() + " d'habitants au total Monument : "+ getcountry();
	}
}
