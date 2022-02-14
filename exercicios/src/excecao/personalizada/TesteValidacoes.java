package excecao.personalizada;

import excecao.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Ana", -7);
			Validar.aluno(null);
		} catch (StringVaziaException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Fim!");
	}
}
