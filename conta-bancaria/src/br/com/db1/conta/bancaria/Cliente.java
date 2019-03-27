package br.com.db1.conta.bancaria;

public class Cliente {

	private String nome;
	
	private String cpf;
	
	public Cliente(String nome, String cpf){
		if(nome == null){
			throw new RuntimeException("Nome � obrigat�rio");
		}
		
		if(nome.length() < 5){
			throw new RuntimeException("Nome deve ser maior que ou igual 5");
		}
		
		/*if(cpf == null){
			throw new RuntimeException("CPF � obrigat�rio");
		}*/
		
		if(cpf.length() != 11){
			throw new RuntimeException("CPF invalido");
		}
		
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getCpf(){
		return this.cpf;
	}
}
