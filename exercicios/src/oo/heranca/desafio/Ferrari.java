package oo.heranca.desafio;

public class Ferrari extends Carro{

	public Ferrari(){
		super(300);
	}
	
	public Ferrari(int velocidade){
		super(velocidade);
		delta = 300;
	}
//	@Override
//	public void acelerar() {
//		velocidadeAtual += 15;
//	}
}
