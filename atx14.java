package at3;

import java.util.Scanner;

public class atx14 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	int n = 1;
	int m = 1;
	
	System.out.println("escolha um valor para a série: ");
	int n1 = entrada.nextInt();
	
	System.out.print("S = ");
	for (int i = 1; i <= n1; i++) {
	 System.out.print(n + "/" + m + " + ");
	 
	 n = n + 1;
	 m = m + 2;
	
	}
	
		 entrada.close();
		 
	
	 }
}
