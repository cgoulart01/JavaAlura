
public class Gerente extends Funcionario implements Autenticavel {


	private Autenticacao access;
	public Gerente() {
		
		this.access = new  Autenticacao();
	}
	@Override
	public void setSenha(int senha) {
		this.access.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.access.autentica(senha);
	}

	@Override
	public double getBonificacao() {
		
		return super.getSalario();
	}

	

}