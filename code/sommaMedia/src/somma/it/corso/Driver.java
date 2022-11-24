package somma.it.corso;

import java.util.Scanner;

/*
 * @Autor Domenico Morelli
 * */
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inseriscii il primo numero: ");
		double a = scanner.nextDouble();
		System.out.println("Inseriscii il secondo numero: ");
		double b = scanner.nextDouble();
		System.out.println("Somma: "+ (a+b) + "\nMedia: " + (a+b)/2);
	}

}
