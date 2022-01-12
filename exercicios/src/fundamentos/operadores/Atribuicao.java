package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		
		c += b; // c = c + b
		c -= a; // c = c - a
		c *= a; // c = c * a;
		c /= b; // c = c / b;
		
		System.out.println(c);
		
		c %= 2; // c = c % 2
		System.out.println(c);
	}
}
