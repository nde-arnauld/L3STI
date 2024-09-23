package exercice5;

public class TestUniversite {

	public static void main(String[] args) {
		Universite pascalPaoli = new Universite("Pascal Paoli");
		
		Titulaire titulaire1 = new Titulaire("Pierre", 1500);
		Titulaire titulaire2 = new Titulaire("Laurent", 2500);
		
		Vacataire vacataire1 = new Vacataire("Michel", 15);
		Vacataire vacataire2 = new Vacataire("Marie", 60);
		
		pascalPaoli.embaucher(titulaire1);
		pascalPaoli.embaucher(titulaire2);
		pascalPaoli.embaucher(vacataire1);
		pascalPaoli.embaucher(vacataire2);
		
		pascalPaoli.presentation();
	}

}
