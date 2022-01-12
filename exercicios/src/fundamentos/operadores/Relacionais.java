package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		
		System.out.println(30 >= 3);
		System.out.println(30 >= 30);
		System.out.println(30 < 29);
		System.out.println(1 <= 1);
		System.out.println(1 != 1);
		
		double nota = 7.1;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}

}
