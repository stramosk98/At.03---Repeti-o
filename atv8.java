package at3;

import java.util.Scanner;

public class atv8 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	int a = 0;
	
	 System.out.println("Informe dois Números: ");
	int n1 = entrada.nextInt();
	int n2 = entrada.nextInt();
	

	 System.out.println("Soma: ");
	 if (n2 > n1) {
	 for (int i = (n1 + 1); i < n2; i++) 
		 a = i + a;
			 System.out.print(a);
	 }
	 if (n1 > n2) {
	 for (int i = (n2 + 1); i < n1; i++)
		 a = i + a;
	 System.out.print(a);
	 }
	
		 entrada.close();
		 
	 }
}
