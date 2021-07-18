package entities;

public class PessoaFisica extends Contribuinte {
	private Double gastoSaude;

	public PessoaFisica(String nome, Double renda, Double gastoSaude) {
		super(nome, renda);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double imposto() {
		Double taxa = (getRenda() < 20000.0) ? getRenda() * 0.15 : getRenda() * 0.25;
		taxa -= getGastoSaude() * 0.5;

		if (taxa < 0.0) {
			taxa = 0.0;
		}
		return taxa;
	}

}
