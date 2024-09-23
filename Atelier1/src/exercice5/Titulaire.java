package exercice5;

public class Titulaire extends Enseignant {
	private double salaire;
	
	public Titulaire(String nom, double salaire) {
		super(nom);
		this.salaire = salaire;
	}
	
	public double salaire() {
		return salaire;
	}
	
	public String toString() {
		return super.toString() + " (titulaire) : "+ salaire +" euros";
	}
}
