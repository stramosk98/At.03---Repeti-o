package at3;

import java.util.Scanner;

public class atv6 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	

	 
	 System.out.println("\nÍmpares");
	 for (int i = 1; i <= 50; i++) {
		 if (i % 2 != 0)
			 System.out.print(i + " | ");
	 }
		 entrada.close();
		 
	 }
}
