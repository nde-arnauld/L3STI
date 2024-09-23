package exercice3;

import java.text.DecimalFormat;

public class testAPI {
	public static void main (String args[]) {
		DecimalFormat df = new DecimalFormat("#0.00");
		System.out.println("Question 1: ");
		System.out.println("Le nombre PI = "+ Math.PI);
		
		System.out.println("\nQuestion 2: ");
		System.out.println("Le nombre réel aléatoir entre 0 et 1 exclus tiré est = "+ df.format(Math.random()));
		
		System.out.println("\nQuestion 3: ");
		double nombre = Math.random();
		System.out.println("nombre = "+ nombre);
		int resultat = 0;
		if (nombre < 0.33) resultat = 1;
		else if (nombre >= 0.33 && nombre <0.66) resultat = 2;
		else resultat = 3;
		System.out.println("Le nombre entier aléatoir entre 1 et 3 inclus tiré est = "+ resultat);
		
		System.out.println("\nQuestion 4: ");
		int x1 = (int) Math.round(Math.random() * 100);
		int x2 = (int) Math.round(Math.random() * 100);
		System.out.println("Le plus grand nombre entre "+ x1 + " et "+ x2 +" est : "+ Math.max(x1, x2));
		
		System.out.println("\nQuestion 5: ");
		String n1 = "Albert";
		String n2 = "Algerie";
		resultat = n1.compareTo(n2);
		if (resultat != 0) {
			System.out.print("Entre "+ n1 + " et "+ n2 +", le premier est : ");

			if (resultat < 0) System.out.println(n1);
			else System.out.println(n2);
		} else {
			System.out.println("Les deux mots sont identiques : "+ n1 +", "+ n2);
		}
	}
}
