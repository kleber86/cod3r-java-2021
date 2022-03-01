package br.com.cod3r.app.financeiro;

import br.com.cod3r.app.calculo.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;

public class Teste {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(1.1, 2.3));
		
		OperacoesAritmeticas op = new OperacoesAritmeticas();
		System.out.println(op.soma(4, 5, 7));
	}
}
