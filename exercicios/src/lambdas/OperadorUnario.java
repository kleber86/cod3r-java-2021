package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisUm = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisUm.andThen(vezesDois).andThen(aoQuadrado).apply(0);
		int resultado2 = aoQuadrado.compose(vezesDois).compose(maisUm).apply(0);
		
		System.out.println(resultado1);
		System.out.println(resultado2);
	}
}
