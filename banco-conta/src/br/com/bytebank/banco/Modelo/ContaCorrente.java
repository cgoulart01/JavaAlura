package br.com.bytebank.banco.Modelo;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente,Integer agencia,Integer conta) {
		super(cliente,agencia,conta);
	}

	@Override
	public String tipo() {
		return "Conta Corrente";
		
	}

}
