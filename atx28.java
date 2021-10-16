package at3;

import java.util.Scanner;

public class atx28 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	float cont = 0;
	float a = 0;
	float j = 0;
	float h = 0;
	
	 System.out.println("Para parar a contagem, digite 0");
	 
	for (int i = 0; i <= 1000; i++) {
	 System.out.println("\nInforme uma temperatura: " + "°C");
	 float t = entrada.nextFloat();
	
	 cont = t + cont;
	 h = cont / i;
	 
 	  if(t > a) {
		a = t;
			
 	  }else if (t < j) { 
		 j = t;
 	  }	 
	 
			 
	 else if(t == 0) 
		 i = 1000; 
	 
	}
	 System.out.print("Maior temperatura: " + a + "\nMenor temperatura: " + j + "\nMedia: " + h);
		 entrada.close();
		 
	
	 }
}
