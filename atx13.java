package at3;

import java.util.Scanner;

public class atx13 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
    int num, fat = 1;
    int cont = 1;

    
        System.out.println("Digite um número: ");
        num = entrada.nextInt();
        
        for(int i = 1;i <= num; i++){
            fat = fat * i;
        }
        
        System.out.println("!" + num + " = " + fat);
        cont++;

	 	
	 entrada.close();
 
	 }
}
