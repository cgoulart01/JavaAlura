
public class TestaBanco {
	public static void main(String[] args) {
		String nome = "Caio Vitor Goulart";
		String cpf = "111.111.111-44";
		String nome2 = "Maria Joaquia";
		String cpf2 = "155.194.837-94";

		Conta contaDocliente = new Conta(nome, cpf);
		Conta contaDocliente2 = new Conta(nome2, cpf2);
		Conta contaDocliente3 = new Conta(nome, cpf);

		contaDocliente.deposita(1000);
		contaDocliente2.deposita(1200);
		contaDocliente3.deposita(1500);
		contaDocliente.saca(200);

	}
}
