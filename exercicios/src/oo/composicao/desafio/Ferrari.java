package oo.composicao.desafio;

public class Ferrari extends Carro{

	Ferrari(){
		super(300);
	}
	
	@Override
	void acelerar() {
		velocidadeAtual += 15;
	}
}
