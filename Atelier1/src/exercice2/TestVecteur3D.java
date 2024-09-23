package exercice2;

import java.text.DecimalFormat;

public class TestVecteur3D {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		
		Vecteur3D v1 = new Vecteur3D(3.0, 2.0, 5.0);
		System.out.print("V1 = "+ v1);
		System.out.println("Norme de v1 = "+ df.format(v1.norme()));
		
		Vecteur3D v2 = new Vecteur3D(1.0, 2.0, 3.0);
		System.out.print("V2 = "+ v2);
		System.out.println("Norme de v2 = "+ df.format(v2.norme()));
		
		System.out.print("V1 + V2 = "+ v1.somme(v2));
		
		System.out.println("V1.V2 = "+ v1.produitScalaire(v2));
		
		System.out.println("Utilisation des méthodes de classe");
		System.out.print("V1 + V2 = "+ Vecteur3D.somme(v1, v2));
		
		System.out.print("V1.V2 = "+ Vecteur3D.produitScalaire(v1, v2));
		System.out.print("V1 = "+ v1);
		System.out.print("V2 = "+ v2);
	}

}
