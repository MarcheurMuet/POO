package fr.fms.entities;

public class TestCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Capital paris = new Capital("France", 2000000, "Tour Eiffel") new City("Paris");
		Capital london = new Capital("GB", 9400000, "Bigben") new City("Londre");
		
		Capital[] capital = {paris, london};
		
        		System.out.println(capital);
	}
}
