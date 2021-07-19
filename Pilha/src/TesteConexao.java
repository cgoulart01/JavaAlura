
public class TesteConexao {
public static void main(String[] args) {
	// apõs o Java 1.7 esse método também é valido mas
	//precisa implementar a interface AutoCloseable na classe
	try(Conexao connect = new Conexao()){
		connect.leDados();
	}catch(Exception x) {
		System.out.println(x.getMessage());
	}
	
// forma antiga de usar o try/catch
//	Conexao connect = null;
//	try {
//		connect = new Conexao();
//		connect.leDados();
//	}catch(IllegalStateException x) {
//		System.out.println(x.getMessage());
//	}finally {
//		connect.fecha();
//	}
}
}
