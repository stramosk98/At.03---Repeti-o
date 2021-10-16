package at3;

import java.util.Scanner;

public class atv2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
	
	for (int i = 0; i <= 10; i++) { 
		System.out.println("Insira seu Login: ");
		int l = entrada.nextInt();
		System.out.println("Insira sua Senha: ");
		int s = entrada.nextInt();
		
		if ( l == s) 
            System.out.println("Inválido, login e senha iguais"); 
            i = 0;
	
		
            if ( l != s){
	              System.out.println("Ok" ); 
	        i = 10;}
	        
	        }
	        
	        
	   
	 
	
		entrada.close();
	}
}
