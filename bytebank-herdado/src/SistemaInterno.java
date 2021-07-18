
public class SistemaInterno {

	public void autentica(Autenticavel g, Integer senha) {
		boolean autenticou = g.autentica(senha);
		if (autenticou) {
			System.out.println("Pode entrar no sistema");
		} else {
			System.out.println("Não pode entrar no sistema");
		}
	}
}
