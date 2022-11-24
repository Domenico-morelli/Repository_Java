package calcolaPotenza.it.corso;

import java.math.*;

public class driver {

	public static void main(String[] args) {
	double i = 1;
	System.out.println("\nFOR");
		for (i = 1; i <= 16; i++) {
			
			System.out.println("2 elevato a " + (int)i + " = " + Math.pow(2, i));
		}
		
		i = 1;
		System.out.println("\nWHILE");
		while (i<16) {
			
			System.out.println("2 elevato a " + (int)i + " = " + Math.pow(2, i));
			i++;
		}

	}

}
