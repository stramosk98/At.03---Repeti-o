package at3;

import java.util.Scanner;

public class atv9 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	
	 System.out.println("Informe um Número: ");
	int tab = entrada.nextInt();
	
	 for (int i = 1; i <= 10; i++) {
		 
		System.out.print(tab + " X " + i + " = " + (i * tab) + "\n");
	 }
	 
	
		 entrada.close();
		 
	 }
}
