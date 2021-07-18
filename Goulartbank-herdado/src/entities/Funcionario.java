package entities;

public abstract class Funcionario {
	private String cpf;
	private String name;
	private Double renda;
	
	public Funcionario(String cpf, String name, Double renda) {
		this.cpf = cpf;
		this.name = name;
		setRenda(renda);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRenda() {
		return this.renda;
	}

	public void setRenda(Double renda){
		this.renda=renda;
	}
	public abstract Double setRendaTotal();

	
}
