package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia da semana.");
		String diaDaSemana = entrada.next();
		
		if(diaDaSemana.equals("Domingo")) {
			System.out.println(1);
		}else if(diaDaSemana.equals("Segunda")){
			System.out.println(2);
		}else if(diaDaSemana.equals("Terça")) {
			System.out.println(3);
		}else if(diaDaSemana.equals("Quarta")) {
			System.out.println(4);
		}else if(diaDaSemana.equals("Quinta")) {
			System.out.println(5);
		}else if(diaDaSemana.equals("Sexta")) {
			System.out.println(6);
		}else if(diaDaSemana.equals("Sabado")) {
			System.out.println(7);
		}else {
			System.out.println("Dia inválido.");
		}
		
		entrada.close();
	}
}
