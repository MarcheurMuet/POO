
public class Person {
	
	static String namePerson = "";
	String town = "unknow";
	int age = 0;
	String firstName;
	
	public Person(String namePerson, String firstName,int age, String town) {
		Person.namePerson = namePerson;
		this.firstName = firstName;
		this.age = 0;
		this.town = town;
	}
	
	public String getnamePerson() {
		return namePerson;
	}
	public void setnamePerson(String namePerson) {
		// TODO Auto-generated method stub
		Person.namePerson = namePerson;
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
	
	
}
