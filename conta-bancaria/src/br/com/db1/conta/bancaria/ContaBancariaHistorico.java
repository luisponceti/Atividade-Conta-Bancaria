package br.com.db1.conta.bancaria;

import java.time.LocalDateTime;

public class ContaBancariaHistorico {
	
	private LocalDateTime data;

	private ContaBancariaTipoOperacao TipoOperacao;
	
	private Double valor;

	public ContaBancariaHistorico(ContaBancariaTipoOperacao tipoOperacao, Double valor) {
		this.data = LocalDateTime.now();
		TipoOperacao = tipoOperacao;
		this.valor = valor;
	}
	
	
}
