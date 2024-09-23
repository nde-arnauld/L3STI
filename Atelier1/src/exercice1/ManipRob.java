package exercice1;

public class ManipRob {
	public static void main(String args[]) {
		Robot robot1 = new Robot("Toto", 10, 20, Robot.SUD);
		Robot robot2 = new Robot("Titi", 0, 0, Robot.NORD);
		
		robot1.avancer();
		robot1.setOrientation(Robot.SUD);
		System.out.println(robot1);
		
		robot2.avancer();
		robot2.setOrientation(Robot.OUEST);
		robot2.avancer();
		System.out.println(robot2);
	}
}
