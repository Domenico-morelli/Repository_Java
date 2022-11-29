package bubblesortarray.driver;

import java.util.Arrays;
import java.util.Scanner;

class Driver {

  static void bubbleSort(int array[]) {
    int size = array.length;    
    for (int i = 0; i < size - 1; i++)   
      for (int j = 0; j < size - i - 1; j++)
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
  }

  public static void main(String args[]) {
      
	  int array[] = new int[10];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Inserisci il valore " + (i+1));
			array[i] = scanner.nextInt();
		}
    

    Driver.bubbleSort(array);
    
    System.out.println("Bubble sort:\n");
    for(int arr: array) {
		System.out.println(arr);
	}
  }
}
