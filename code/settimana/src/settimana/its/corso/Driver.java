package settimana.its.corso;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un numero da 1 a 7 e stamperò il relativo giorno della settimana");
		int giorno;

		do {
			giorno = scanner.nextInt() - 1;
			switch (giorno) {
			case 0:
				System.out.println("Il giorno della settimana è:" + Settimana.LUNEDI);
				break;
			case 1:
				System.out.println("Il giorno della settimana è:" + Settimana.MARTEDI);
				break;
			case 2:
				System.out.println("Il giorno della settimana è:" + Settimana.MERCOLEDI);
				break;
			case 3:
				System.out.println("Il giorno della settimana è:" + Settimana.GIOVEDI);
				break;
			case 4:
				System.out.println("Il giorno della settimana è:" + Settimana.VENERDI);
				break;
			case 5:
				System.out.println("Il giorno della settimana è:" + Settimana.SABATO);
				break;
			case 6:
				System.out.println("Il giorno della settimana è:" + Settimana.DOMENICA);
				break;

			}
		} while (0 >= giorno || giorno <= 7);

	}
}
