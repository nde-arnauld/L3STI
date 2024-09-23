package exercice5;

public class Vacataire extends Enseignant {
	private int UNE_HEURE_DE_COURS = 40;
	private int nbHeuresCours;
	
	public Vacataire(String nom, int nbHeuresCours) {
		super(nom);
		this.nbHeuresCours = nbHeuresCours;
	}
	
	public double salaire() {
		return nbHeuresCours * UNE_HEURE_DE_COURS;
	}
	
	public String toString() {
		return super.toString() +" (vacataire "+ nbHeuresCours +" heures) : "+ salaire() +" euros";
	}
}
