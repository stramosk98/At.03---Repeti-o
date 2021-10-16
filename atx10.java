package at3;

import java.util.Scanner;

public class atx10 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	double  r = 0;
	int aux = 0;
	 System.out.println("Informe dois Números: ");
	int n1 = entrada.nextInt();
	int n2 = entrada.nextInt();
	
	
	 for (int i = 1; i <= n2; i++) {
		 aux = n1;
		r = n1 * aux;
		
		
	 } 
	 System.out.println(r);
	 
	 	
	 entrada.close();
 
	 }
}
