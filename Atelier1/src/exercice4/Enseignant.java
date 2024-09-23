package exercice4;

public class Enseignant extends Personne {
	private float salaire;
	private int nbheuresCours;
	
	public Enseignant(String nom, int age, float salaire, int nbheuresCours) {
		super(nom, age);
		this.salaire = salaire;
		this.nbheuresCours = nbheuresCours;
	}
	
	public String toString() {
		return "Enseignant "+ super.toString() +" "+ salaire +" euros";
	}
	
	public void afficher() {
		System.out.println("*******Enseignant*******");
		super.afficher();
		System.out.println("Salaire : "+ salaire);
		System.out.println("Nombre d'heures de cours : "+ nbheuresCours);
	}
}
