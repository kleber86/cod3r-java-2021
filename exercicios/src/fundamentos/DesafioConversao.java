package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Digite o primeiro salario");
		String num1 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o segundo salario");
		String num2 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o terceiro salario");
		String num3 = entrada.next().replace(",", ".");
		
		Double salario1 = Double.parseDouble(num1);
		Double salario2 = Double.parseDouble(num2);
		Double salario3 = Double.parseDouble(num3);
		
		Double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("A media é " + media);
		
		entrada.close();
	}

}