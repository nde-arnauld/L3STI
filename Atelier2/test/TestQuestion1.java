import java.time.LocalDate;

public class TestQuestion1 {
    public static void main(String args[]) {
        Adresse adresse1 = new Adresse("20250", "Colonel Feracci", "Corte");
        Adresse adresse2 = new Adresse("20250", "Corte");
        
        Personne personne1 = new Personne("NDE", "Arnauld", LocalDate.of(2000, 2, 18), adresse1);
        Personne personne2 = new Personne("MADE", "Steffy", LocalDate.of(2002, 3, 28), adresse2);
        Personne personne3 = new Personne("NDE", "Arnauld", LocalDate.of(2000, 2, 18), adresse1);

        System.out.println(personne1);
        System.out.println(personne2);
        System.out.println(personne3);

        System.out.println("\n------plusAgeeQue------");
        if (personne1.plusAgeeQue(personne2)) {
            System.out.println(personne1.getPrenom() +" est plus âgé que "+ personne2.getPrenom());
            System.out.println(personne1);
            System.out.println(personne2);
        }

        System.out.println("\n------plusAgee------");
        if (Personne.plusAgee(personne2, personne3)) {
            System.out.println(personne2.getPrenom() +" est plus âgé que "+ personne3.getPrenom());
        } else {
            System.out.println(personne3.getPrenom() +" est plus âgé que "+ personne2.getPrenom());
        }
        System.out.println(personne2);
        System.out.println(personne3);

        System.out.println("\n------equals------");
        if (personne1.equals(personne3)) {
            System.out.println(personne1.getPrenom() +" est égale à "+ personne3.getPrenom());
        }
        System.out.println(personne1);
        System.out.println(personne3);

        System.out.println("\n------equals------");
        if (personne1.equals(personne2)) {
            System.out.println(personne1.getPrenom() +" est égale à "+ personne2.getPrenom());
        }
        System.out.println(personne1);
        System.out.println(personne2);
    }
}
