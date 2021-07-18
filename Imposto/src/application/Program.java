package application;

import entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contribuinte> list = new ArrayList<Contribuinte>();
		System.out.print("Informe o numero de Contribuintes: ");
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.print("Contribuinte" + i + "data: ");
			System.out.print("Pessoa Física ou Pessoa Jurídica  (f/j) ?");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.println("Renda Anual");
			Double rendaAnual = sc.nextDouble();
			if (type == 'f') {
				System.out.print("Gastos Com Saúde: ");
				Double gastoSaude = sc.nextDouble();
				PessoaFisica x = new PessoaFisica(name, rendaAnual, gastoSaude);
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
