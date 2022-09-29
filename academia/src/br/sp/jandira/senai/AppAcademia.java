package br.sp.jandira.senai;

import java.time.LocalDate;

import br.sp.jandira.senai.model.Cliente;

public class AppAcademia {

	public static void main(String[] args) {
		
		new Cliente();

		Cliente Vick = new Cliente();
		
		Vick.nome ="Vick Gindre";
		Vick.peso = 52;
		Vick.altura = 1.62;
		Vick.dataDeNascimento = LocalDate.of(2000, 1, 10); 
				
		System.out.println(Vick.getrImc());
		System.out.println(Vick.getIdade());
		
		Cliente pedro = new Cliente();
		pedro.nome = "pedro silva";
		pedro.peso = 58;
		pedro.altura = 1.76;
		pedro.dataDeNascimento = LocalDate.of(1999, 2, 12);
		
		System.out.println(pedro.getrImc());
		System.out.println(pedro.getIdade());
		
		
		
	}

}
