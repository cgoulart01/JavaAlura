package Aplication;

import entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<Funcionario>();
		System.out.print("Informe o Numero de Funcionários: ");
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.print("Funcionario" + i + ": ");
			System.out.print("Comum ou Gerente  (c/g) ?");
			char type = sc.next().charAt(0);
			System.out.print("CPF: ");
			String cpf = sc.next();
			System.out.print("CPF: ");
			
			String name = sc.next();
			System.out.println("Renda");
			Double rendaAnual = sc.nextDouble();
			if (type == 'c') {
				System.out.print("Quantidade de: ");
				Double gastoSaude = 1500.00;
				Integer qntBus = sc.nextInt();
				Colaborador x = new Colaborador(name, rendaAnual,,);
				list.add(x);
			} else {
				System.out.print("Nº de Funcionários: ");
				Integer numeroFuncionarios = sc.nextInt();
				PessoaJuridica x = new PessoaJuridica(name, rendaAnual, numeroFuncionarios);
				list.add(x);
			}
		}

		System.out.println();
		System.out.println("Impostos pagos:");
		for (Contribuinte c : list) {
			System.out.println(c.getNome() + "; $" + String.format("%.2f", c.imposto()));
		}
		System.out.println();
		double sum = 0.0;
		for (Contribuinte c : list) {
			sum += c.imposto();
		}

		System.out.println("Imposto Total: "+String.format("%.2f",sum));

		sc.close();
	}

}
