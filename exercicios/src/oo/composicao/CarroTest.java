package oo.composicao;

public class CarroTest {

	public static void main(String[] args) {
		Carro c1 = new Carro();
	
		System.out.println("O carro está ligado? " + c1.estaLigado());
		
		c1.ligar();
		System.out.println("O carro está ligado? " + c1.estaLigado());
		System.out.println("Contador de giros: " + c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		System.out.println("Contador de giros: " + c1.motor.giros());
		
		c1.frear();
		c1.frear();
		
		// Faltou o encapsulamento
		//c1.motor.fatorInjecao = 10000;
		
		System.out.println("Contador de giros: " + c1.motor.giros());
	}
}
