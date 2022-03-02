package br.com.cod3r.cm.visao;

import br.com.cod3r.cm.modelo.Tabuleiro;

public class Temp {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(3, 3, 9);
		
		tabuleiro.registrarObservador(e -> {
			if(e.isGanhou()) {
				System.out.println("Ganhou...");
			}else {
				System.out.println("Perdeu...");
			}
		});
		tabuleiro.alternarMArcacao(0, 0);
		tabuleiro.alternarMArcacao(0, 1);
		tabuleiro.alternarMArcacao(0, 2);
		tabuleiro.alternarMArcacao(1, 0);
		tabuleiro.alternarMArcacao(1, 1);
		tabuleiro.alternarMArcacao(1, 2);
		tabuleiro.alternarMArcacao(2, 0);
		tabuleiro.alternarMArcacao(2, 1);
		tabuleiro.abrir(2, 2);
		//tabuleiro.alternarMArcacao(2, 2);
	}
}
