package br.com.cod3r.cm;

import br.com.cod3r.cm.modelo.Tabuleiro;

public class Aplicacao {
	public static void main(String[] args) {
		Tabuleiro tb = new Tabuleiro(6, 6, 6);
		
		tb.alternarMArcacao(4, 4);
		tb.alternarMArcacao(4, 5);
		tb.abrir(3, 3);
		
		System.out.println(tb);
	}
}
