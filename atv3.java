package at3;

import java.util.Scanner;

public class atv3 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
	
	for (int i = 0; i <= 10; i++) { 
		System.out.println("Digite seu nome: ");
		String n = entrada.nextLine();
		
		if (n.length() <= 3) 
            System.out.println("Inv�lido"); 
            i = 0;
	
		
	 	        if (n.length() > 3) {
	              System.out.println("Nome V�lido" ); 
	        i = 10;}
	        
	        }
	        
	for (int i = 0; i <= 10; i++) { 
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
	   
		if (idade < 0 || idade > 150)
			System.out.println("Idade Inv�lida"); 
        i = 0;
        
        if (idade > 0 && idade < 150) {
            System.out.println("Idade V�lida" ); 
      i = 10;}
      
      }
	
	for (int i = 0; i <= 10; i++) { 
		System.out.println("Digite seu salario: ");
		double sal = entrada.nextDouble();
	   
		if (sal < 0)
			System.out.println("Salario Inv�lido"); 
        i = 0;
        
        if (sal > 0) {
            System.out.println("Salario V�lido" ); 
      i = 10;}
      
      }
	
	for (int i = 0; i <= 10; i++) { 
		System.out.println("Digite seu sexo, F ou M: ");
		String sex = entrada.next();
		
		 if (sex.equals ("M")) {
             System.out.println("O sexo �: Masculino "); 
		 i = 10;
	
		 
       if (sex.equals("F")) 
           System.out.println("O sexo �: Femenino");
           i = 10;
        }else{
       	System.out.println("Inv�lido");
       	i = 0;
     }
   }
	
	for (int i = 0; i <= 10; i++) { 
		System.out.println("Digite seu estado civil, s, c, v ou d: ");
		String est = entrada.next();
		
        if (est.equals("c")) { 
           System.out.println("Casado");
           i = 10;
     
        if (est.equals("s")) 
            System.out.println("Solteiro");
            i = 10;
      
        if (est.equals("v")) 
            System.out.println("Vi�va");
            i = 10;
       
        if (est.equals("d")) 
            System.out.println("Divorciada");
            i = 10;
         }else{
        	System.out.println("Inv�lido");
        	i = 0;
        }
       }

	
		entrada.close();
	}
}
