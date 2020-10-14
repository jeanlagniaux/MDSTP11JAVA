package onziemeprojet.utils;

public class Conjugateur {

	public static void conjugueAvecSaisi(String [] array) {
		
		for(String verbe : array) {
			
			verbe = verbe.replace("er", "");
			
			System.out.println("Je " + verbe + "e");
			System.out.println("Tu " + verbe + "es");
			System.out.println("Il " + verbe + "e");
			System.out.println("Nous " + verbe + "eons");
			System.out.println("Vous " + verbe + "ez");
			System.out.println("Ils " + verbe + "ent");
			System.out.println("");
		}

	}

}
