package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "�mpar";

		Function<String, String> oResultadoE = resultado -> "O resultado � " + resultado;

		Function<String, String> empolgado = valor -> "!!!";

		String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(11);

		System.out.println(resultadoFinal);
	}
}
