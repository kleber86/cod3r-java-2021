package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		Calculo somar = (x, y) -> {
			return x + y;
		};
		
		Calculo subtracao = (x, y) -> { return x - y; };
		
		Calculo multiplicacao = (x, y) -> x * y;
		
		System.out.println(somar.executar(1, 1));
		System.out.println(subtracao.executar(1, 1));
		System.out.println(multiplicacao.executar(1, 2));
		
		System.out.println(somar.legal());
		System.out.println(Calculo.muitoLegal());
	}

}
