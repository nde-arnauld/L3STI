import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Personne implements Cloneable{
    private static final Adresse ADRESSE_INCONNUE = null;
    private String nom;
    private String prenom;
    public final LocalDate dateNaissance;
    private Adresse adresse=ADRESSE_INCONNUE;
    
    public static int nombrePersonnes = 0;

	/**
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param laDate la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 */
	public Personne(String leNom,String lePrenom, LocalDate laDate, Adresse lAdresse){
		nom = leNom.toUpperCase();
		prenom=lePrenom;
		dateNaissance=laDate;
		adresse=lAdresse;
        nombrePersonnes += 1;
	}
	 
	/** 
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param j le jour de naissance
	 * @param m le mois de naissance
	 * @param a l'année de naissance
	 * @param numero le numero de la rue
	 * @param rue la rue
	 * @param code_postal le code postal de l'adresse
	 * @param ville la ville ou la personne habite
	 */
	public Personne(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville){
		this(leNom, lePrenom, LocalDate.of(a,m,j),new Adresse(numero,rue,code_postal,ville));
	}

	

	/**
	 * Accesseur
	 * @return retourne le nom
	 */
	public String getNom(){
		return nom;
	}
	/**
	 * Accesseur
	 * @return retourne le prénom
	 */
	public String getPrenom(){
		return prenom;
	}
	/**
	 * Accesseur
	 * @return retourne la date de naissance
	 */
	public LocalDate getDateNaissance(){
		return dateNaissance;
	}
	/**
	 * Accesseur
	 * @return retourne l'adresse	 
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * Modificateur
	 * @param retourne l'adresse	 
	 */
	public void setAdresse(Adresse a) {
		adresse=a;
	}
		
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String result="\nNom : "+nom+"\n"
		+"Prénom : "+prenom+"\n"+
		"Né(e) le : "+dateNaissance.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))+"\n"+
		"Adresse : "+
		adresse.toString();
		return result;
	}

    /**
     * Comparaison de l'âge de deux personnes
     * 
     * 
     * @param personne1 première personne
     * @param personne2 deuxième personne
     * @return <b>True<b/> Si la première personne est plus agée
     */
    public static boolean plusAgee(Personne personne1, Personne personne2) {
        return personne1.plusAgeeQue(personne2);
    }

    /**
     * Comparaison de l'âge d'une personne par rapport à une autre
     * 
     * @param autrePersonne la personne 
     * @return <b>True</b> Si la personne qui appelle est plus agée 
     *          que cette passée en paramètre
     */
    public boolean plusAgeeQue(Personne autrePersonne) {
        if (dateNaissance.isBefore(autrePersonne.dateNaissance)) return true;
        else return false;
    }

    /**
     * Vérifie si deux instances de personnes sont égales, 
     * en comparant les noms, prénoms et dates de naissances
     * 
     * @param autrePersonne l'autre personne
     * @return <b>True</b> Si les deux instances de personnes sont égales 
     */
    public boolean equals(Personne autrePersonne) {
        boolean sontEgales = false;
        if (nom.equals(autrePersonne.nom)) {
            if (prenom.equals(autrePersonne.prenom)) {
                if (dateNaissance.equals(autrePersonne.dateNaissance)) {
                    sontEgales = true;
                } else sontEgales = false;
            } else sontEgales = false;
        } else sontEgales = false;

        return sontEgales;
    }

 }

    
   
   