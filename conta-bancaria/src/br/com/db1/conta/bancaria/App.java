package br.com.db1.conta.bancaria;

public class App {
	
	public static void main(String...args){
		Cliente cliente = new Cliente("Lu�s Fernando","09855171900");
		ContaBancaria conta = new ContaBancaria("1234", "0004", 1000.0, ContaBancariaTipo.CORRENTE, cliente);
		
	
				
		
		
	}

}
