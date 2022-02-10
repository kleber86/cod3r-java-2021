package lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		Calculo c1 = new Soma();
		Calculo c2 = new Multiplicar();
		
		System.out.println(c1.executar(1, 2));
		System.out.println(c2.executar(1, 1));

	}

}
