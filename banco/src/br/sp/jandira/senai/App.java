package br.sp.jandira.senai;

import br.sp.jandira.senai.model.Conta;

public class App {


	public static void main(String[] args) {
		
		Conta contaDoPablo = new Conta();
		Conta contaDaVictoria = new Conta();
		
		contaDaVictoria.numero = "100-98";
		contaDaVictoria.titular = "Victoria Rosa";
		contaDaVictoria.tipoConta = "Corrente";
		contaDaVictoria.saldo = 100;
		
		contaDoPablo.numero = "150-58";
		contaDoPablo.titular = "Pablo Pontes";
		contaDoPablo.tipoConta = "Poupança";
		contaDoPablo.saldo = 20;
		
	    contaDaVictoria.exibirDadosDaConta();
       contaDoPablo.exibirDadosDaConta();
	    
	    contaDoPablo.depositar(10);
	    contaDoPablo.exibirDadosDaConta();
	    
	    contaDoPablo.sacar(100);
	    contaDoPablo.exibirDadosDaConta();
	    
	    // Trasferencia entre a conta do Pablo e da Victoria
		
	    contaDoPablo.transferir(40, contaDaVictoria);
	    contaDaVictoria.exibirDadosDaConta();
	    contaDoPablo.exibirDadosDaConta();
	    
	    contaDoPablo.transferir(50, contaDaVictoria);
	    contaDaVictoria.exibirDadosDaConta();
	    contaDoPablo.exibirDadosDaConta();
	}

}
