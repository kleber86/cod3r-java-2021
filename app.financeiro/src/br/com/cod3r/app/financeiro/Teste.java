package br.com.cod3r.app.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.cod3r.app.Calculadora;

public class Teste {

	public static void main(String[] args) {
		Calculadora calc = ServiceLoader.load(Calculadora.class)
				.findFirst()
				.get();
		System.out.println(calc.soma(1.1, 2.3));
			
		try {
			Field fieldID = calc.getClass().getDeclaredFields()[0];
			fieldID.setAccessible(true);
			fieldID.set(calc, "def");
			fieldID.setAccessible(false);
			
			System.out.println(calc.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
