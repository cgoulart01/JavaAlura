package br.com.bytebank.banco.Modelo;
/**
 * Classe que padroniza uma conta abstrata
 * @author cgoulart01
 * 
 * */
public abstract class Conta {
	private Cliente cliente;
	private double saldo;
	private Integer agencia;
	private Integer conta;
/**
 *
 * @author cgoulart01
 * pra fazer uma conta precisa ser um cliente cadastrado,
 * inserir uma agencia e uma conta.
 * @param cliente
 * @param agencia
 * @param conta
 * */
	public Conta(Cliente cliente, Integer agencia, Integer conta) {
		this.cliente = cliente;
		setAgencia(agencia);
		setConta(conta);
		saldo = 0;
		cabecalhoInicial();

	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public abstract String tipo();

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia2) {
		this.agencia = agencia2;
	}

	public Integer getConta() {
		return conta;
	}

	public void cabecalhoInicial() {
		System.out.println("Criando Conta...");
		cabecalho();
		System.out.println("Conta criada!");
	};

	public void cabecalho() {
		Cliente cliente = this.cliente;
		System.out.println();
		System.out.println("Nome titular: " + cliente.getNome());
		System.out.println("Tipo da Conta: " + this.tipo());
		System.out.println("Agencia: " + this.getAgencia());
		System.out.println("conta: " + this.getConta());
		System.out.println("saldo atual:" + this.getSaldo());
		System.out.println();
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double saldo) {
		this.saldo += saldo;
	}
/***
 * 
 *o valor de transferencia precisa ser maior ou igual ao saldo
 * caso contrário é executado o alerta de Saldo Insuficiente!.
 *  @param valor
 *  @param destino
 *  @throws SaldoInsuficienteException
 * 
*/
public void transfere(double valor, Conta destino) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo em conta Insuficiente para Transação!");
		}
		this.saldo -= valor;
		destino.deposita(valor);
	}

/***
 * 
 *o valor de saque precisa ser maior ou igual ao saldo
 * caso contrário é executado o alerta de Saldo Insuficiente!.
 *  @param valor
 *  @throws SaldoInsuficienteException
 * 
*/
	public void saca(double valor) {
		if (valor < this.saldo) {
			throw new SaldoInsuficienteException("Saldo em conta Insuficiente para Transação!");
		}
		this.saldo -= valor;

	}

}
