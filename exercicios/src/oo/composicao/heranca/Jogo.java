package oo.composicao.heranca;

public class Jogo {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador();
		
		jogador1.x = 10;
		jogador1.y = 10;
		
		jogador1.andar(Direcao.NORTE);
		jogador1.andar(Direcao.LESTE);
		jogador1.andar(Direcao.NORTE);
		jogador1.andar(Direcao.LESTE);
		
		System.out.println(jogador1.x);
		System.out.println(jogador1.y);
	}
}
