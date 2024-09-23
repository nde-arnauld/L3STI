package exercice4;

public class Etudiant extends Personne {
	private String numEtu;
	
	public Etudiant(String nom, int age, String numEtu) {
		super(nom, age);
		this.numEtu = numEtu;
	}
	
	public void setNumEtu(String nouveauNum) {
		numEtu = nouveauNum;
	}
	
	public String getNumEtu() {
		return numEtu;
	}
	
	public String toString() {
		return "Etudiant numero "+ numEtu +" "+ super.toString();
	}
	
	public void afficher() {
		System.out.println("*******Etudiant*******");
		System.out.println("Numero étudiant : "+ numEtu);
		super.afficher();
	}
}
