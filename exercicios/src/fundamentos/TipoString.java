package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		String a = "Bom dia!";
		System.out.println(a);
		
		String b = "Boa Tarde";
		System.out.println(b.charAt(0));
		System.out.println(b.concat("!!!"));
		System.out.println(b + "!!");
		System.out.println(b.startsWith("B"));
		System.out.println(b.endsWith("Tarde"));
		System.out.println(b.startsWith("boa"));
		System.out.println(b.toLowerCase().startsWith("boa"));
		System.out.println(b.toLowerCase().endsWith("tarde"));
		System.out.println(b.length());
		System.out.println(b.equals("Boa tarde"));
		System.out.println(b.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var idade = 20;
		var salario = 1.901;
		
		System.out.println("Nome: " + nome + " idade: " + idade + " Salario: " + salario);
		System.out.printf("Nome: %s, idade: %d, Salario: %f.", nome, idade, salario);
	}
}
