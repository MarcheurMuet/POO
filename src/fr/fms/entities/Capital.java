package fr.fms.entities;

public class Capital {
	
	private String monument;
	private String pays;
	City city;
	int habitant;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public Capital(String Monument, int habitant, String pays, City city) {
		this.monument = Monument;
		this.pays = pays;
		this.habitant = habitant;
		this.city = city;
	}
	
	public void setpays(String pays) {
		// TODO Auto-generated method stub
		this.pays = pays;
	}
	
	public String getpays() {
		// TODO Auto-generated method stub
		return pays;
	}
	
	public void setmonument(String monument) {
		// TODO Auto-generated method stub
		this.monument = monument;
	}
	
	public String getmonument() {
		// TODO Auto-generated method stub
		return monument;
	}
	
	public void sethabitant(int habitant) {
		// TODO Auto-generated method stub
		this.habitant = habitant;
	}
	
	public int gethabitant() {
		// TODO Auto-generated method stub
		return habitant;
	}
	
	public void setCity(City city) {
		this.city = city;
	}
	
	public Object getCity() {
		return city;
	}
	
	public String toString() {
		return getmonument() + " , " +gethabitant() + " d'habitants au total Monument : "+ getpays() + getCity();
	}
}
