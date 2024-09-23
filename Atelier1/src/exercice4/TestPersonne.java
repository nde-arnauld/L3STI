package exercice4;

public class TestPersonne {

	public static void main(String[] args) {
		Personne pers = new Personne("Marie", 20);
		pers.afficher();
		
		Etudiant etu = new Etudiant("El", 24, "20242010");
		System.out.println(etu);
	}

}
