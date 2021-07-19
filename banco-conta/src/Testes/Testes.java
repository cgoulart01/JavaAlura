package Testes;
import Modelo.*;
public class Testes {

	public static void main(String[] args) {
		Cliente caio = new Cliente("Caio Vitor", "154.156.487-48");
		Cliente luisa = new Cliente("Luiza", "154.465.485-85");
		Conta c1 = new ContaCorrente(caio, 2222, 1515);
		Conta c2 = new ContaPoupanca(luisa, 2224, 2415);
		c1.deposita(2000.00);
		c1.cabecalho();
		try {
			c1.transfere(3000, c2);
		} catch (Exception x) {
			System.out.println(x.getMessage());
		}
	}

}
