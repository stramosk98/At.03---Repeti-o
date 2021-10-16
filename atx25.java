package at3;

import java.util.Scanner;

public class atx25 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	double a = 0;
	

	System.out.println("Lojas Quase Dois - Tabela de preços");
	for (int i = 1; i <= 50; i++) {
	a = (1.99 * i);
	
	System.out.println( i + " - R$ " + a);
	
	} 
	
	
	 entrada.close();
 
	 }
}


