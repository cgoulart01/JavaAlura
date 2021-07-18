package entities;

public class PessoaJuridica extends Contribuinte {
	private int numeroFuncionario;

	public PessoaJuridica(String nome, Double renda, Integer numeroFuncionario) {
		super(nome, renda);
		this.numeroFuncionario = numeroFuncionario;
	}

	public int getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(Integer numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	@Override
	public Double imposto() {
		double taxa =(getNumeroFuncionario() < 10) ?  getRenda() * 0.16 : getRenda() * 0.14;
		return taxa;
		
	}

}
