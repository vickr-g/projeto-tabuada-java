package br.senai.jandira.sp;



public class Media {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		double [] notas = {8.0, 7.9, 10.0, 6.4, 2.0, 1.3};
		
//		 System.out.println(notas[2]);
//		 
//		 System.out.println(notas[3]);
//		 notas[3]= 8.4;
//		 System.out.println(notas[3]);
		 
		 
		 //Exibir tamanho do vetor
		
		System.out.println(notas.length);
			
		
		// //Exibir todas as notas do vetor
		
		int i = 0;
		while (i < notas.length) {
			 
			 System.out.println(notas[i]);
			i++;
			
		}
		String nome = " Senai Vicente Amato ";
			System.out.println(nome.charAt(2));
			
			
			
			String palavra1 ="sena";
			String palavra2 = "senai";
			
			System.out.println(palavra1.compareTo(palavra2));
		
			
			
			
			int [] pesos = new int [5];
			
			pesos[3] = 145;
			pesos[1] = 687;
			
			System.out.println("------------------------------------------------");
			
			 i = 0;
			while (i < pesos.length) {
				 
				 System.out.println(pesos[i]);
				i++;
			}
			
		
			
			System.out.println();
			System.out.println("*** PAR OU IMPAR *****");
			 
		    	i = 0;
		    	while (i < 1000) {
		    	i++;
		    	if (i % 2 == 0) {
		    		
		    	System.out.println(i + "Par");
		    		
		    	} else {
		    	System.out.println(i + "Impar");
		    	}
		    }
		    	// maior numero do vetor 
		    	System.out.println();
		    	System.out.println("maior numero do vetor");
		    	int[] numeros = {3, 45, 12, 123, 48, 121, 14};
		    
		    	
		    	i = 0;
		    	int maior = 0;
		    	while ( i < numeros.length) {
		    		if(numeros[i] > maior) {
			    		maior = numeros[i];
		    		}
		    	  	 i++;
		    	}
		    	System.out.println(maior);
		    	
	}
	 
}
