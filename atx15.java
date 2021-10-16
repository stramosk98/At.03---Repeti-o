package at3;

import java.util.Scanner;

public class atx15 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	int n = 37;
	int m = 38;
	int o = 1;
	float r = 0;
	
	System.out.println("escolha um valor para a série: ");
	int n1 = entrada.nextInt();
	
	System.out.print("S = ");
	for (int i = 1; i <= n1; i++) {
	 System.out.print("(" + n + "*" + m + ")/" + o + " + ");
	 
	 n = n - 1;
	 m = m - 1;
	 o = o + 1;
	r = (n * m) / o;
	System.out.print(r + " + ");
	}
	
		 entrada.close();
		 
	
	 }
}
