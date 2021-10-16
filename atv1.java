package at3;

import java.util.Scanner;

public class atv1 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
	
	for (int i = 0; i <= 10; i++) { 
		System.out.println("Informe um número de 0 a 10: ");
		int n = entrada.nextInt();
		
		if (n > 10) 
            System.out.println("Inválido"); 
            i = 0;
	
		
	 	        if (n <= 10) {
	              System.out.println("Ok" ); 
	        i = 10;}
	        
	        }
	        
	        
	   
	 
	
		entrada.close();
	}
}
