public class Person {
	
	String namePerson = "";
	String town = "unknow";
	int age = 0;
	String firstName;
	Object City;
	
	public Person(String namePerson, String firstName,int age, String town, Object City) {
		this.namePerson = namePerson;
		this.firstName = firstName;
		this.age = age;
		this.town = town;
		this.City = City;
	}
	
	public String getnamePerson() {
		return namePerson;
	}
	
	public void setnamePerson(String namePerson) {
		// TODO Auto-generated method stub
		this.namePerson = namePerson;
	}
	
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		// TODO Auto-generated method stub
		this.firstName = firstName;
	}
	
	public String gettown() {
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
		return City;
	}

	public void setCity(Object City) {
		this.City = City;
	}
	
	public String toString() {
		return "[LastName= "+ getnamePerson() + ", firstName= "+ getfirstName() + ", age= "+getage()+ ", adress= "+ gettown()+"] "+ getCity()+"\n";
	}
}
