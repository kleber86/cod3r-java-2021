package oo.composicao.desafio;

public class Ferrari extends Carro{

	Ferrari(){
		super(300);
	}
	
	Ferrari(int velocidade){
		super(velocidade);
		delta = 300;
	}
//	@Override
//	void acelerar() {
//		velocidadeAtual += 15;
//	}
}
