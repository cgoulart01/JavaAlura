package br.com.alura.bitebank;

import br.com.bytebank.banco.Modelo.Cliente;
import br.com.bytebank.banco.Modelo.Conta;
import br.com.bytebank.banco.Modelo.ContaCorrente;

public class TesteBiblioteca {
	Cliente cliente = new Cliente("Caio Vitor","565.456.156-48");
	Conta c = new ContaCorrente(cliente,1221,1222);
}
