package at3;

import java.util.Scanner;

public class atx11 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	int n = 0;

	for (int i = 1; i <= 10; i++) {
	System.out.println("Digite um número: ");
	n = entrada.nextInt();
	
	
	
	 if (n % 2 == 0) 
	  System.out.println("Par " + n);
			 
			 
			 if (n % 2 != 0)
	 System.out.println("\nÍmpar " + n);
	 		 
	
	}
		
	 entrada.close();
 
	 }
}
