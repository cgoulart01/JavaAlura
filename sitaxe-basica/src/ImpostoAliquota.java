
public class ImpostoAliquota {
	/**
	 * dados validos a partir do m�s de abril do ano-calend�rio de 2015.
	 * */
	public static void main(String[] args) {
		double salario = 1900.00;
		if (salario > 4664.68) {

			String porcentagem = "27,5%";
			System.out.println("a dedu��o do IR do seu sal�rio � de " + porcentagem);
			System.out.println("voc� pode deduzir at� R$869,36.");
		}
		if (salario <= 4664.68 && salario >= 3751.06) {
			String porcentagem = "22,5%";
			System.out.println("a dedu��o do IR do seu sal�rio � de " + porcentagem);
			System.out.println("voc� pode deduzir at� R$636,13.");
		}
		if (salario < 3751.06 && salario >= 2826.66) {

			String porcentagem = "15%";
			System.out.println("a dedu��o do IR do seu sal�rio � de " + porcentagem);
			System.out.println("voc� pode deduzir at� R$354,80.");
		}
		if (salario < 2826.66 && salario >= 1903.99) {
			String porcentagem = "7,5%";
			System.out.println("a dedu��o do IR do seu sal�rio � de " + porcentagem);
			System.out.println("voc� pode deduzir at� R$142,80.");
		}
		if (salario < 1903.99) {
			System.out.println("seu sal�rio � R$" + salario + "e voc� � insento de dedu��o do IR.");
		}
	}
}
