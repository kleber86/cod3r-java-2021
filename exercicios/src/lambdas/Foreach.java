package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Gui");

		System.out.println("Metodo tradicional...");
		for (String aluno : aprovados) {
			System.out.println(aluno);
		}

		System.out.println("\nLambda #1");
		aprovados.forEach(nome -> System.out.println(nome));
		
		System.out.println("\nMethod reference");
		aprovados.forEach(System.out::println);
	}
}
