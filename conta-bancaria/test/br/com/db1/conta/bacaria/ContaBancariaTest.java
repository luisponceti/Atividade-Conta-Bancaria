package br.com.db1.conta.bacaria;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.conta.bancaria.Cliente;
import br.com.db1.conta.bancaria.ContaBancaria;
import br.com.db1.conta.bancaria.ContaBancariaTipo;

public class ContaBancariaTest {
	
	private ContaBancaria conta;
	
	@Before
	public void init(){
		Cliente cliente = new Cliente("Luís Fernando","09855171900");
		conta = new ContaBancaria("1234", "0004", 1000.0, ContaBancariaTipo.CORRENTE, cliente);
	}
	
	@Test
	public void deveSacarDinheiro(){
		conta.sacar(500.0);
		Assert.assertEquals(500.0, conta.getSaldo(), 0);
		Assert.assertEquals(1, conta.getHistoricos().size());
	}

	@Test(expected= RuntimeException.class)
	public void deveRetornarDepositoNegativo(){
		conta.depositar(-500.0);
	}
	
	@Test
	public void deveDepositarDinheiro(){
		conta.depositar(500.0);
		Assert.assertEquals(1500.0, conta.getSaldo(), 0);
		Assert.assertEquals(1, conta.getHistoricos().size());
	}
	
	
	@Test(expected= RuntimeException.class)
	public void deveRetornarErrorQuandoSaldoMenorQueSaque(){
		conta.sacar(2000.0);
		
	}
}
