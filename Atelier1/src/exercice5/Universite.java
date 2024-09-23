package exercice5;

import java.util.ArrayList;

public class Universite {
	private String nom;
	private ArrayList<Enseignant> listeEnseignant;
	
	public Universite(String nom) {
		this.nom = nom;
		listeEnseignant = new ArrayList<Enseignant>();
	}
	
	private void afficherSalaires() {
		double salaireTotal = 0;
		for (Enseignant enseignant : listeEnseignant) {
			System.out.println(enseignant);
			salaireTotal += enseignant.salaire();
		}
		System.out.println("Total des salaires = "+ salaireTotal +" euros");	
	}
	
	public void embaucher(Enseignant e) {
		listeEnseignant.add(e);
	}
	
	public void presentation() {
		System.out.println("LISTE DES ENSEIGNANTS DE L'UNIVERSITE "+ nom);
		System.out.print("Effectif: ");
		int nbEnseignants = listeEnseignant.size();
		if (nbEnseignants > 1) System.out.println(nbEnseignants +" enseignants");
		else System.out.println(nbEnseignants +" enseignant");
		afficherSalaires();
	}
}
