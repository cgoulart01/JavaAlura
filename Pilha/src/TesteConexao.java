
public class TesteConexao {
public static void main(String[] args) {
	Conexao connect = null;
	try {
		connect = new Conexao();
		connect.leDados();
	}catch(IllegalStateException x) {
		System.out.println(x.getMessage());
	}finally {
		connect.fecha();
	}
}
}
