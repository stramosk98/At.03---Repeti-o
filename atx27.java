package at3;

import java.util.Scanner;

public class atx27 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	float price = 0;
	float a = 0;
	float din = 0;
	System.out.println("Lojas Tabajara\n");
	
	for (int i = 1; i <= 50; i++) {
	System.out.println("Digite o valor de algum produto: ");
	price = entrada.nextFloat();
	System.out.println( "Produto " + i + ": R$ " + price);
	a = price + a;
	
		if (price == 0) 
		 i = 50;
		 
		
	}
	
	System.out.println( "Total: R$ " + a);
	System.out.println("Digite o valor que irá pagar: ");
	din = entrada.nextFloat();
	
	System.out.println("Dinheiro: R$ " + din + "\nTroco: R$ " + (din - a));
	
	 entrada.close();
 
	 }
}


