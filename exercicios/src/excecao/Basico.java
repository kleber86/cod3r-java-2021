package excecao;

public class Basico {

	public static void main(String[] args) {
		Aluno a1 = null;
		
		try {
			imprimirNomeDoAluno(a1);
		}catch(Exception e) {
			System.out.println("Erro ao apresentar o nome do usuario: " + e.getMessage());
		}
		
		try {
			System.out.println(5 / 0);
		}catch(ArithmeticException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
