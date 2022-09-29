package br.sp.jandira.senai.model;

public class Conta {

	public String numero;
	public String titular;
	public  double saldo; 
	public  String tipoConta;
      
	public  void transferir(double valorTrasferir, Conta contaDestino){
    	
		boolean ocorreuSaque = sacar(valorTrasferir);
		
		if (ocorreuSaque) {
    	contaDestino.depositar(valorTrasferir);
    	
      } else {
    	  
    	  System.out.println("nao foi possivel realizar a transferencia");
      }
      }
      
	public boolean sacar(double valorSacado){
    	  if (saldo >= valorSacado) {
    		  saldo = saldo - valorSacado;
    		  return true;
    		  
    	  } else {
    		  System.out.println("Saldo indisponivel.");
    		  return false;
    	  }
      }
      
	public  void depositar(double valorDeposito){
    	  saldo = saldo + valorDeposito;
      }
	
	public  void exibirDadosDaConta() {
		System.out.println("****RESUMO DAS CONTAS****");
		System.out.printf("Nome do titular: %s\n", titular);
		System.out.printf("Numero da conta: %s\n", numero);
		System.out.printf("Saldo da conta:: %s\n", saldo);
		System.out.printf("Tipo da conta: %s\n",tipoConta);
		System.out.println("---------------------------------");
	
				
	}

}
