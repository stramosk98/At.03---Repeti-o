package at3;

import java.util.Scanner;

public class atx24 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	float cont = 0;
	float h = 0;
	
	 System.out.println("Quantos CDs você tem? ");
	 int n = entrada.nextInt();
	 
	for (int i = 1; i <= n; i++) {
	 System.out.println("\nInforme o valor do CD: " + i);
	 float t = entrada.nextFloat();
	
	 cont = t + cont;
	 h = cont / i;
				 		 
	}
	 System.out.print("Valor total investido: " + cont + "\nValor medio dos CDs: " + h);
		 entrada.close();
		 
	
	 }
}
