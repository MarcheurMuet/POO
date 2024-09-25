public class City {

	static String name = "";
	String country = "unknow";
	int people = 0;
	String state = "";
	static int cityNumb = 0;
	static int cityNumbration = 0;
	
	final int MIN_CITY_PEOPLE = 0;
	final int MIN_CITY = 0;
	
	public City(String name, int people, String state) {
		City.name = name;
		this.people = people;
		this.state = state;
		cityNumbration++;
	}
	
//	public City(String name, String country, int people) {
//		City.name = name;
//		this.country = country;
//		this.people = people;
//		cityNumbration++;
//	}
//	
//	public City(String name) {
//		this.name = name;
//		this.Country = "Unknow";
//		this.People = MIN_CITY_PEOPLE;
//	}
//	
//	public City() {
//		this("unknow");
//	}
//	
	public void display(String name) {
		System.out.println("\nville de "+ name + " en " + country + " ayant " + people + " habitants");
	}
//	
//	public void setPeople(int People) {
//		// TODO Auto-generated method stub
//		this.People = People;
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		City city1 = new City("Toulouse", "France", 450000);
	
//		City city2 = new City("Montpellier", "France", 30000);
//		City city3 = new City("Londre", "Angleterre", 40000);
//		city1.display();
//		city2.display();
//		city3.display();
//		
//		city1.setPeople(city1.People + 2000 );
//		city1.display();
//		}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		// TODO Auto-generated method stub
		City.name = name;
	}
	
	public String getcountry() {
		return country;
	}
	public void setcountry(String country) {
		// TODO Auto-generated method stub
		this.country = country;
	}
	
	public String getstate() {
		return state;
	}
	public void setstate(String state) {
		// TODO Auto-generated method stub
		this.state = state;
	}
	
	public int getpeople() {
		return people;
	}
	public void setpeople(int people) {
		if (people <= 0)
		throw new RuntimeException("Le nombre d'habitant doit être positif!");
		this.people = people;
	}
	
	public void setcityNumbration(int cityNumbration) {
		if (cityNumbration <= 0)
			throw new RuntimeException("Le nombre de ville doit être positif!");
		
	}
	public int getcityNumbration() {
		return cityNumbration;
	}
	
//	public String toString() {
//		return "\n[Ville : "+ getName() + "]"+" [Pays : " + getCountry() +"]"+ " [Nombre d'habitants : " + getPeople()+"]";
//	}
	
//	public String toString() {
//		return "\nLa ville de "+ getname() +" en " + getstatut() + " ayant " + getpeople()+" habitants";
//	}
	
	public String toString() {
		return "Borne city [name= "+ getname() +", state= " + getstate() + ", nbhabitant= " + getpeople()+"]";
	}
	
	public City(String name, int people) {
		City.name = name;
		this.people = people;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		City Montpellier = new City("Montpellier","France", 4000);
//		City Toulouse = new City("Toulouse","France", 444000);
		
//		System.out.println(Montpellier+ "\n");
//		
////		city.setPeople(-5000);
//		while (cityNumb < cityNumbration) {
//			cityNumb = cityNumb +1;
//		}
//		Toulouse.display(name);
		
//		System.out.println(Toulouse);
		System.out.println("\nLe total de ville est de : " +  cityNumb);
		}
}
