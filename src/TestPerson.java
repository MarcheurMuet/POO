
public class TestPerson {

	public static void main(String[] args) {
			Person remi = new Person("Rémi", "Estaque", 23,"Saint-Laurant-de-Carnols", new City("Paris", 1400000, "France"));
			Person valentin = new Person("Valentin", "Labouray", 39,"Avignon", new City("Avignon",30000 ,"France"));
			Person evan = new Person("Evan", "Polge", 23,"Montpellier", new City("Goudargue", 2500 ,"France"));
			
			System.out.print(remi);
			System.out.println(valentin);
			System.out.println(evan);
	}
}