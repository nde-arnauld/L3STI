package exercice5;

public abstract class Enseignant {
	protected String nom;
	
	public Enseignant(String nom) {
		this.nom = nom;
	}
	
	public abstract double salaire();
	
	public String getNom() {
		return nom;
	}
	
	public String toString() {
		return nom;
	}
}
