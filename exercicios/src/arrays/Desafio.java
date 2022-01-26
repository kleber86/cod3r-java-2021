package arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quantas notas? ");
		int qtdNotas = entrada.nextInt();
		
		double[] notas = new double[qtdNotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Informe a notas: " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double nota : notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.println("A media é " + media);
		entrada.close();
	}
}
