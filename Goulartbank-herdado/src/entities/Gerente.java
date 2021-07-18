package entities;

public class Gerente extends Funcionario {
	private Double auxViagem;
	private Integer qntViagem;

	public Gerente(String cpf, String name,Double renda, Integer qntViagem) {
		super(cpf, name, renda);
		this.setQntViagem(qntViagem);
		setAuxViagem(0.25);
	}

	public Double getAuxViagem() {
		return auxViagem = this.getRenda() * this.auxViagem;
	}

	private void setAuxViagem(Double auxViagem) {
		 this.auxViagem = this.getRenda() * auxViagem;
	}

	public Integer getQntViagem() {
		return this.qntViagem;
	}

	public void  setQntViagem(Integer qntViagem) {
		this.qntViagem = qntViagem ;
	}

	
	public Double setRendaTotal() {
		Double renda = (this.qntViagem>0)? this.getRenda() + this.auxViagem:this.getRenda();
		return renda;

}
}