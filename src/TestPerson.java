public class TestPerson {

    public static void main(String[] args) {
        Person Macron = new Person("Macron", "Emmanuel", 43, "l'Elysée de Paris", new City("amiens", 1400000, "France"));
        Person Sarkozy = new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris", 2000000, "France"));
        Person Johnson = new Person("Johnson", "Boris", 56, "Downing street à London", new City("New York", 2500, "Etats-Unis"));
        Person Depardieu = new Person("Depardieu", "Gerard", 72, "Moscou", new  City("Châteauroux", 1400000, "France"));
        Person Kravitz = new Person("Kravitz", "Lenny", 56, "Hôtel particulier à Paris", new  City("New York", 30000, "USA"));
        Person Lawrence = new Person("Lawrence", "Jennifer", 30, "Louisville au USA", new City("Indian Hills", 2500, "USA"));

        Person[] personnes = {Macron, Sarkozy, Johnson, Depardieu, Kravitz, Lawrence};

        for (Person personne : personnes) {
        	Object ville = personne.gettown();
        	if (((City) personne.getCity()).getcountry().equals("France") && (ville.equals("Paris"))) {
        		System.out.println(personne + " population Paris 2000000 d'habitants");
        	} else if (((City) personne.getCity()).getcountry().equals("France")) {
                       System.out.println(personne);
                   }
                }
            }
        }