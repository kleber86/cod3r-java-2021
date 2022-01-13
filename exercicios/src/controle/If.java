package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua nota");
		double nota = entrada.nextDouble();
		
		if(nota <= 10 && nota >= 7) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns");
		}
		if(nota < 7 && nota >= 4) {
			System.out.println("Em Recuperação");
		}
		if(nota >= 0 && nota < 4) {
			System.out.println("Reprovado");
		}
		
		
		entrada.close();
	}
}
