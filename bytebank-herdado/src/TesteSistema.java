
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		Administrador adm = new Administrador();
		Cliente cliente = new Cliente();
		cliente.setSenha(5454);
		g.setSenha(2222);
		adm.setSenha(5555);
		SistemaInterno s = new SistemaInterno();
		s.autentica(g,2222);
		s.autentica(adm,5555);
		s.autentica(cliente,5453);
}

}
