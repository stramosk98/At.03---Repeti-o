package at3;

import java.util.Scanner;

public class atx26 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	float a, pao = 0;
	
	System.out.println("Informe o preço do pão: ");
	pao = entrada.nextFloat();
	System.out.println("Panificadora Pão de Ontem - Tabela de preços");
	for (int i = 1; i <= 50; i++) {
	a = (pao * i);
	
	System.out.println( i + " - R$ " + a);
	
	} 
	
	
	 entrada.close();
 
	 }
}


