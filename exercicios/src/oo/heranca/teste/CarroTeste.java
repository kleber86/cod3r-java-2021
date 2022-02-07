package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		Civic civic = new Civic();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		System.out.println(civic);
		
		Ferrari ferrari = new Ferrari(300);
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println(ferrari);
	}

}
