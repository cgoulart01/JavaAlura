package entities;

public class Colaborador extends Funcionario {

	private Double auxPassagem;
	private Integer qntBus;
	private Integer diasTrabalhados;
	private Double passagem;

	public Colaborador(String cpf, String name,Double renda, Integer qntBus, Integer diasTrabalhados, Double passagem) {
		super(cpf, name, renda);
		this.qntBus = qntBus;
		this.diasTrabalhados = diasTrabalhados;
		this.passagem = passagem;
	}

	public Double getAuxPassagem() {
		return auxPassagem;
	}

	public void setAuxPassagem() {
		this.auxPassagem = this.diasTrabalhados * (this.passagem * this.qntBus);
	}

	@Override
	public Double setRendaTotal() {

		Double renda = (this.getQntBus() > 0) ? this.getRenda() + this.getRenda() * this.auxPassagem : this.getRenda();
		return renda;
	}

	public Integer getQntBus() {
		return qntBus;
	}

}
