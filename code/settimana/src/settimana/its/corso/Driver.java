package settimana.its.corso;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un numero da 1 a 7 e stamper� il relativo giorno della settimana");
		int giorno;

		do {
			giorno = scanner.nextInt() - 1;
			switch (giorno) {
			case 0:
				System.out.println("Il giorno della settimana �:" + Settimana.LUNEDI);
				break;
			case 1:
				System.out.println("Il giorno della settimana �:" + Settimana.MARTEDI);
				break;
			case 2:
				System.out.println("Il giorno della settimana �:" + Settimana.MERCOLEDI);
				break;
			case 3:
				System.out.println("Il giorno della settimana �:" + Settimana.GIOVEDI);
				break;
			case 4:
				System.out.println("Il giorno della settimana �:" + Settimana.VENERDI);
				break;
			case 5:
				System.out.println("Il giorno della settimana �:" + Settimana.SABATO);
				break;
			case 6:
				System.out.println("Il giorno della settimana �:" + Settimana.DOMENICA);
				break;

			}
		} while (0 >= giorno || giorno <= 7);

	}
}
