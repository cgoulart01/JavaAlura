package br.com.bytebank.banco.Modelo;

public class SaldoInsuficienteException extends RuntimeException {
public SaldoInsuficienteException(String msg) {
	super(msg);
}

}
