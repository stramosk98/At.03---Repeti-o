package at3;

import java.util.Scanner;

public class atv7 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	
	 System.out.println("Informe dois Números: ");
	int n1 = entrada.nextInt();
	int n2 = entrada.nextInt();
	

	 System.out.println("entre: ");
	 if (n2 > n1) {
	 for (int i = (n1 + 1); i < n2; i++) 
		 
			 System.out.print(i + " | ");
	 }
	 if (n1 > n2) {
	 for (int i = (n2 + 1); i < n1; i++)
		 
			 System.out.print(i + " | ");
	 }
	
		 entrada.close();
		 
	 }
}


