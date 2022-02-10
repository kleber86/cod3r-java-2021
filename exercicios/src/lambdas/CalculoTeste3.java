package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		BinaryOperator<Double> somar = (x, y) -> {
			return x + y;
		};
		
		BinaryOperator<Double> subtracao = (x, y) -> { return x - y; };
		
		BinaryOperator<Double> multiplicacao = (x, y) -> x * y;
		
		System.out.println(somar.apply(1.0, 1.0));
		System.out.println(subtracao.apply(1.0, 1.0));
		System.out.println(multiplicacao.apply(1.0, 2.0));
	}

}
