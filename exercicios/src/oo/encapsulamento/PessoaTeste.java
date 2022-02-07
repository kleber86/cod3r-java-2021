package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Ana", "Silva", 10);
				
		System.out.println(p1.getNome());
		System.out.println(p1.getIdade());
		System.out.println(p1.getNomeCompleto());
	}

}
