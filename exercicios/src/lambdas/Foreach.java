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
		
		System.out.println("\nMethod reference #01");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #02");
		aprovados.forEach(nome -> imprimirNome(nome));
		
		System.out.println("\nMethod reference #02");
		aprovados.forEach(Foreach::imprimirNome);
	}
	
	static void imprimirNome(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}
}
