package exercice5;

public class Vacataire extends Enseignant {
	private int SALAIRE_HEURE = 40;
	private int nbHeuresCours;
	
	public Vacataire(String nom, int nbHeuresCours) {
		super(nom);
		this.nbHeuresCours = nbHeuresCours;
	}
	
	public double salaire() {
		return nbHeuresCours * SALAIRE_HEURE;
	}
	
	public String toString() {
		return super.toString() +" (vacataire "+ nbHeuresCours +" heures) : "+ salaire() +" euros";
	}
}
