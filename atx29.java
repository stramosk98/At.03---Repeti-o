package at3;

import java.util.Scanner;

public class atx29 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	
	 System.out.println("Montar a tabuada de: ");
	int tab = entrada.nextInt();
	 System.out.println("Começar por: ");
		int com = entrada.nextInt();
		 System.out.println("Terminar em: ");
			int ter = entrada.nextInt();
			 
	 for (int i = com; i <= ter; i++) {
		 
		System.out.print(tab + " X " + i + " = " + (i * tab) + "\n");
	 
	 }
	 entrada.close();
		 
	 }
}
