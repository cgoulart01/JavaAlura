
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicinais\n");
		int idade = 16;
		int quantidadePessoas = 3;
		if (idade>=18) {
			System.out.println("voc� � adulto");
			System.out.println("Seja Bem vindo");
		}else {
			if (quantidadePessoas>1) {
				System.out.println("voc� n�o � adulto, mas est� acompanhado!");
			}
		}
	}
}

