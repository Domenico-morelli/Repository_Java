package matera.it.its.corso;

import java.util.Scanner;

public class Driver {

	private static void potenza(int a, int b) {
		int result = a;
		for (int i = 1; i < b; i++) {
			result = result * a;
			
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un numero da elevare");
		a = scanner.nextInt();
		System.out.println("Inserisci l'esponente");
		b = scanner.nextInt();

		potenza(a, b);
	}

}
