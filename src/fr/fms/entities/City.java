package fr.fms.entities;

public class City {

	private String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public City(String name) {
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	public String toString() {
		return getname();
	}
}
