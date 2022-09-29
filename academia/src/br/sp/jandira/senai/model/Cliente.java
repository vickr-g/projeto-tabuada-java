package br.sp.jandira.senai.model;

import java.time.Period;

public class Cliente {
		
		private static final String LocalDate = null;
		public String nome;
		public java.time.LocalDate dataDeNascimento;
		public double altura;
		public double peso;
		
		
	    public double getrImc(){
	    	return peso / Math.pow(altura, 2);
			
		}

		public int getIdade() {
			
				Period p = Period.between(dataDeNascimento, java.time.LocalDate.now());
			return p.getYears();
			
		}
		
		public void getStatusImc() {
			
		}
		
		

	}


