
public class TesteConexao {
public static void main(String[] args) {
	try {
		Conexao connect = new Conexao();
		connect.leDados();
		connect.fecha();
	}catch(IllegalStateException x) {
		System.out.println(x.getMessage());
	}
}
}
