package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia");
		
		System.out.println("Bom");
		System.out.println(" dia!");
		
		System.out.printf("Mega: %d, %d, %d, %d", 1, 2, 3, 4);
		System.out.printf("Salario: %.1f%n", 1999.999);
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = entrada.nextLine();
		System.out.println("Digite sua idade");
		String idade = entrada.nextLine();
		
		
		System.out.println("O nome digitado foi: " + nome + " Idade: " + idade);
		
		
		entrada.close();		
	}
}
