package br.sp.jandira.senai;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	
public static void main(String[] args) {
	
	Random sorteador;
	Scanner leitor = new Scanner(System.in);
	int escolhaUser, escolhaComputador;
	
	//opções para o usuario
	
	System.out.println("JOKENPO");
	System.out.println("1 - PEDRA");
	System.out.println("2 - PAPEL");
	System.out.println("3 - TESOURA");
	System.out.println("------------------------------------");
	System.out.println("Escolha um numero de 1 á 3:");
	int escolha = leitor.nextInt();
	
	
	if (escolha ==1) {
		
		System.out.println("O usuario escolheu pedra");
	}
	
     if (escolha ==2) {
		
		System.out.println("O usuario escolheu papel");
	}
	
     if (escolha ==3) {
 		
 		System.out.println("O usuario escolheu tesoura");
 	}
 	
	
	//Gerando numero aleatorio de 1 a 3
	
	   int numeroEscolha = (int)(Math.random()*3) +1; //Gerando numero aleatorio de 1 a 3
	   
	   System.out.println("------------------------------------");
	   System.out.println("O computador escolheu:" + numeroEscolha);
	  
	   
	   
	   if (numeroEscolha ==1) {
			
			System.out.println("O computador escolheu pedra");
		}
		
	     if (numeroEscolha ==2) {
			
			System.out.println("O computador escolheu papel");
		}
		
	     if (numeroEscolha ==3) {
	 		
	 		System.out.println("O computador escolheu tesoura");
	 		
	 		
	 	}
	     // REGRAS DO JOGO
	     
	    	if (escolha == numeroEscolha) {
	    	
	    		System.out.println("O jogo EMPATOU");
	    	    System.out.println("*** FIM DE JOGO *****");
	    	}
	    	
          if (escolha == 1 && numeroEscolha == 2 ) {
        	  System.out.println("O computador venceu");
        	  
        	  
          }
          if (escolha == 2 && numeroEscolha == 1 ) {
        	  System.out.println("O usuario venceu");
	    	
	    	
	    	}
          
          if (escolha == 3 && numeroEscolha == 1 ) {
        	  System.out.println("O usuario venceu");
          }
          
          
          if (escolha == 3 && numeroEscolha == 2 ) {
        	  System.out.println("O computador venceu");
          }
          
          if (escolha == 1 && numeroEscolha == 3 ) {
        	  System.out.println("O usuario venceu");
          }
          
          }

          
}
          