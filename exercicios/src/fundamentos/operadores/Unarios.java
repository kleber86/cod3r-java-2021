package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++;
		--b;
		
		++b;
		--a;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Desafio");
		System.out.println(++a == b--);
		System.out.println(a);
		System.out.println(b);
	}
}
