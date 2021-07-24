package br.com.bytebank.banco.Modelo;
/**
 * Classe que padroniza os clientes
 * 
 * 
 * @author cgoulart01
 * @version 1.0
 * 
 * */


public class Cliente {
		private String nome;
		private String cpf;
		
	public Cliente(String nome,String cpf) {
		setNome(nome);
		setCpf(cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
