package arrayprj.it.its.corso;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int valore, array[] = new int[10];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Inserisci il valore " + (i+1));

			array[i] = scanner.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("valore in posizione " + i + " dell'array " + +array[i]);

		}

	}

}
