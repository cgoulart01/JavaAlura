package Modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, Integer agencia, Integer conta) {
		super(cliente, agencia, conta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String tipo() {
		return "Conta Poupança" ;
	}

}
