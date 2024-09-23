package exercice1;


public class Robot {
	private String reference;
	private String nom;
	private int x;
	private int y;
	private int orientation;
	
	public static int nombreDeRobotsCrees = 0;
	
	public static final int NORD = 1;
	public static final int EST = 2;
	public static final int SUD = 3;
	public static final int OUEST = 4;
	
	
	public Robot(String nom, int positionX, int positionY, int orientation) {
		this.nom = nom;
		this.x = positionX;
		this.y = positionY;
		
		if (orientation >= 1 && orientation <= 4) {
			this.orientation = orientation;
		} else {
			System.out.println("Cette orientation est invalide!!!");
		}

		nombreDeRobotsCrees ++;
		reference = "ROB" + nombreDeRobotsCrees;
	}
	
	public Robot(String nom) {
		this(nom, 0, 0, NORD);
	}
	
	public void setOrientation(int nouvelleOrientation) {
		if (nouvelleOrientation >= 1 && nouvelleOrientation <= 4) {
			orientation = nouvelleOrientation;
		} else {
			System.out.println("Cette orientation est invalide!!!");
		}
	}
	
	public void avancer() {
		switch (orientation) {
			case NORD: {
				y += 1;
				break;
			}
			case EST: {
				x += 1;
				break;
			}
			case SUD: {
				if (y > 0) {
					y -= 1;
				}
				break;
			}
			case OUEST: {
				if (x > 0) {
					x -= 1;
				}
				break;
			}
		}
	}
	
	public String getReference() {
		return reference;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void afficherDirection() {
		String direction = "";
		switch (orientation) {
			case NORD: {
				direction = "NORD";
				break;
			}
			case EST: {
				direction = "EST";
				break;
			}
			case SUD: {
				direction = "SUD";
				break;
			}
			case OUEST: {
				direction = "OUEST";
				break;
			}
		}
		System.out.println("-> " + direction);
	}
	
	public void afficheToi() {
		String direction = "";
		
		switch (orientation) {
			case NORD: {
				direction = "NORD";
				break;
			}
			case EST: {
				direction = "EST";
				break;
			}
			case SUD: {
				direction = "SUD";
				break;
			}
			case OUEST: {
				direction = "OUEST";
				break;
			}
		}
		System.out.println("reference = << " + reference + 
				" >> \nnom = "+ nom +
				" \nx = "+ x +
				"\ny = "+ y +
				"\norientation = "+ direction + "\n");
	}
	
	
	@Override
	public String toString() {
		String direction = "";
		
		switch (orientation) {
			case 1: {
				direction = "NORD";
				break;
			}
			case 2: {
				direction = "EST";
				break;
			}
			case 3: {
				direction = "SUD";
				break;
			}
			case 4: {
				direction = "OUEST";
				break;
			}
		}
		return "reference = << " + reference + 
				" >> \nnom = "+ nom +
				" \nx = "+ x +
				"\ny = "+ y +
				"\norientation = "+ direction + "\n";
	}
	

}
