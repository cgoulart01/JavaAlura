
public class Administrador extends Funcionario implements Autenticavel {
	private Autenticacao access;
	
	public Administrador() {
		super();
		this.access = new  Autenticacao();
	}


	@Override
	public double getBonificacao() {
		return 1500;
	}

	
	@Override
	public void setSenha(int senha) {
		this.access.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.access.autentica(senha);
	}


}
