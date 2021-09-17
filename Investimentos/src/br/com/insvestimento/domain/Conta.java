package br.com.insvestimento.domain;

public class Conta {

	private double saldo;
	private String agencia;
	private String titular;
	private String numero;
	
	//construtor
	public Conta(double saldo, String agencia, String titular, String numero) {
		super();
		this.saldo = saldo;
		this.agencia = agencia;
		this.titular = titular;
		this.numero = numero;
	}
	
	
	//getters and setter
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", agencia=" + agencia + ", titular=" + titular + ", numero=" + numero + "]";
	}


	public void depositar(double valor) {
		this.saldo +=  valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	
	
	
	
	
	
}
