public class Person {
    private String name;
    private String firstName;
    private int age;
    private String town;
    private City city;
	
	 public Person(String name, String firstName, int age, String town, City city) {
	        this.name = name;
	        this.firstName = firstName;
	        this.age = age;
	        this.town = town;
	        this.city = city;
	    }

	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		// TODO Auto-generated method stub
		this.firstName = firstName;
	}
	
	public Object gettown() {
		return town;
	}
	public void settown(String town) {
		// TODO Auto-generated method stub
		this.town = town;
	}
	
	public int getage() {
		return age;
	}
	public void setage(int age) {
		if (age <= 0)
		throw new RuntimeException("Cette personne n'est pas née?!");
		this.age = age;
	}
	
	public Object getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	public String toString() {
		return  getname() +  getfirstName() + ", age= "+getage() + " "+  gettown()+ getCity();
	}
	
	public void afficherAvecPopulation() {
        System.out.printf("Nom : %s, Prénom : %s, Ville : %s (%d habitants)%n", name, firstName, city.getName(), city.getpeople());
    }
}
