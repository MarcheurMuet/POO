package fr.fms.entities;

public class Personne extends Capital {
	
	private String Entreprise;
	private String name;
	int Salaire;
	Object Capital = getcapital();
	
	public Personne(String name, String Entreprise, int Salaire, Capital capital) {
		super(monument, country, null, people);
		this.Entreprise = Entreprise;
		this.name = name;
		this.Salaire = Salaire;
	}
	
	public void setname(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	
	public String getEntreprise() {
		return Entreprise;
	}
	public void setEntreprise(String Entreprise) {
		// TODO Auto-generated method stub
		this.Entreprise = Entreprise;
	}
	
	public int getSalaire() {
		return Salaire;
	}
	public void setSalaire(int Salaire) {
		// TODO Auto-generated method stub
		this.Salaire = Salaire;
	}
	
	public Object getcapital() {
		// TODO Auto-generated method stub
		return Capital;
	}
	public void setcapital(Capital capital) {
		// TODO Auto-generated method stub
		this.Capital = capital;
	}
	
	public String toString() {
		return getname() + " fait parti de " +getEntreprise() + ", il a un salaire de : "+ getSalaire()+"€."+ " Il habite à "+ getcapital();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
