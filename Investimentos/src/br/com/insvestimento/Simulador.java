package br.com.insvestimento;

import br.com.insvestimento.domain.Conta;

public class Simulador {

	public static void main(String[] args) {
		
		
		Conta conta1 = new Conta(2000, "00004", "zé", "123123");
		System.out.println(conta1.getSaldo());
		conta1.depositar(1000);
		System.out.println(conta1.getSaldo());
		conta1.sacar(2000);
		System.out.println(conta1.getSaldo());
		
		System.out.println(conta1.toString());

	}

}
