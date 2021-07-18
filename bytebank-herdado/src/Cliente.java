
public class Cliente extends Usuarios implements Autenticavel {
	private Autenticacao access;
	public Cliente() {
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

}
