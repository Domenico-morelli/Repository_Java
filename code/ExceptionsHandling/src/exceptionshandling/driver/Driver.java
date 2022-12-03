package exceptionshandling.driver;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		int array[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Inserisci il valore " + (i + 1));
				array[i] = scanner.nextInt();
			}
		} catch (InputMismatchException e) {
			System.out.println(e);

		} catch (Exception e) {
			System.out.println(e);

		}

		Arrays.sort(array);

		for (int arr : array) {
			System.out.println(arr);
		}

	}
}
