package at3;

import java.util.Scanner;

public class atx17 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		int j = 0;
		
		System.out.println("Informe um número: ");
		int n = entrada.nextInt();
	
		if (n == 2) {
			j = 0;}
		
		else if (n == 1) {
			j = 1;}
		
		for (int i = 2; i <= (n - 1); i++) { 
			
			
			
		if (n % i == 0) 
			j = j + 1;}
		
		if (j >= 1 ) 
            System.out.println(n + " não é primo"); 
		
	
		
		else 
	              System.out.println(n + "  é primo"); 
	 	      
		
		
		    
	
		     
	   
	 
	
		entrada.close();
	}
}
