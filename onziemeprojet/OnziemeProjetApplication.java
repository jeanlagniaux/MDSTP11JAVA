package onziemeprojet;

import java.util.Arrays;
import java.util.Scanner;

import onziemeprojet.utils.Conjugateur;

public class OnziemeProjetApplication {

	private static String[] verbes = { "manger", "chanter", "ranger" };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Choisir un verbe du premier groupe non-irrégulier : ");

		String nouveauVerbe = sc.nextLine();
		

		verbes = addElement(verbes, nouveauVerbe);

		Conjugateur.conjugueAvecSaisi(verbes);

	}

	public static String[] addElement(String[] verbes, String nouveauverbe) {
		verbes = Arrays.copyOf(verbes, verbes.length + 1);
		verbes[verbes.length - 1] = nouveauverbe;
		return verbes;
	}

}
