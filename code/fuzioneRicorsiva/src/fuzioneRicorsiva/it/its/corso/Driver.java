package fuzioneRicorsiva.it.its.corso;

public class Driver {

	private static int funcRicorsiva(int n) {

		if (n % 2 == 0) {
			
			return 0;
		}
		System.out.println(n/2);
		return funcRicorsiva((n / 2) + 1);
	}

	public static void main(String[] args) {
		System.out.println(funcRicorsiva(1009));
	}

}
