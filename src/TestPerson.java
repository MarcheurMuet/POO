public class TestPerson {

    public static void main(String[] args) {
        Person Macron = new Person("Macron", "Emmanuel", 43, "l'Elysée de Paris", new City("amiens", 1400000, "France"));
        Person Sarkozy = new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris", 2000000, "France"));
        Person Johnson = new Person("Johnson", "Boris", 56, "Downing street à London", new City("New York", 2500, "Etats-Unis"));
        Person Depardieu = new Person("Depardieu", "Gerard", 72, "Moscou", new  City("Châteauroux", 1400000, "France"));
        Person Kravitz = new Person("Kravitz", "Lenny", 56, "Hôtel particulier à Paris", new  City("New York", 30000, "USA"));
        Person Lawrence = new Person("Lawrence", "Jennifer", 30, "Louisville au USA", new City("Indian Hills", 2500, "USA"));

        Person[] personnes = {Macron, Sarkozy, Johnson, Depardieu, Kravitz, Lawrence};
        	
        System.out.println("Liste des personnalitées");
        for (Person personne : personnes) {
        	if(((City) personne.getCity()).getcountry().contains("")){
        		System.out.println(personne);
        	}
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("Liste après notre filtre");
        for (Person personneVerif : personnes) {
        	Object ville = personneVerif.getadress();
        	if (((City) personneVerif.getCity()).getcountry().equals("France") && (ville.equals("Paris"))) {
        		System.out.println(personneVerif + " population Paris 2000000 d'habitants.");
        	} else if (((City) personneVerif.getCity()).getcountry().equals("France")) {
                       System.out.println(personneVerif);
        	}
        }
    }
}