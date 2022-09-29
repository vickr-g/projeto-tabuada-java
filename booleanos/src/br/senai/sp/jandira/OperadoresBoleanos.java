package br.senai.sp.jandira;

public class OperadoresBoleanos {

	public static void main(String[] args) {
		
		boolean maiorDeIdade;
		
		maiorDeIdade = true;
	    maiorDeIdade = false;
	    
	    System.out.println(maiorDeIdade);
		 
	    // Operadores lógicos
	    
	    boolean teste = 7 > 8; 
	    
	     
	    System.out.println("7 > 8: " + teste);
	    
	    teste = 7 < 8;
	     
	    System.out.println("7 < 8: " + teste);
	    
	    teste = 7 <= 8;
	   
	    System.out.println("7 <= 8: " + teste);
	   
        teste = 7 >= 8;
	   
	    System.out.println("7 >= 8: " + teste);
	   
        teste = 7 >= 7;
	   
	    System.out.println("7 >= 7: " + teste);
	    
	    
	    teste = 7 == 8;
	   
	    System.out.println("7 == 8: " + teste);
	   
        teste = 7 != 8;
	   
	    System.out.println("7 != 8: " + teste);
	    
        teste = 8== 7 + 1;
	   
	   System.out.println("8== 7 + 1: " + teste);
	   
       teste = 3 < 5 || 4 < 3;
	   
	   System.out.println("3 < 5 ou 4 < 3: " + teste);
	   
	   // Teste Lógico AND
	   teste = 3 < 5 && 4 > 3;
	   System.out.println("3 < 5 e 4 > 3 " + teste);
	   
	   teste = 3 > 5 && 4 < 3;
	   System.out.println("3 > 5 e 4 < 3 " + teste);
	   
	   teste = 3 > 5 && 4 < 3;
	   System.out.println("3 > 5 e 4 < 3 " + teste);
	   
	   teste = 3 < 5 && 4 > 3 && 7 <= 10 && 9 > 2;
	   System.out.println("3 < 5 && 4 > 3 && 7 <= 10 && 9 > 2 " + teste);
	   
	   
	   
	}
}
