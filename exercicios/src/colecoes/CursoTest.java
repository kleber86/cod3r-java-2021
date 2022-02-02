package colecoes;

import oo.composicao.Aluno;
import oo.composicao.Curso;

public class CursoTest {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Ana");
		Aluno aluno2 = new Aluno("Pedro");
		Aluno aluno3 = new Aluno("João");
		
		Curso curso1 = new Curso("Java 2022");
		Curso curso2 = new Curso("Javascript 2022");
		Curso curso3 = new Curso("Ruby 2022");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso 1...");
			System.out.println("... e meu nome é " + aluno.nome);
			System.out.println();
		}
		
		for(Aluno aluno : curso2.alunos) {
			System.out.println("Estou matriculado no curso 2...");
			System.out.println("... e meu nome é " + aluno.nome);
			System.out.println();
		}
		
		for(Aluno aluno : curso3.alunos) {
			System.out.println("Estou matriculado no curso 3...");
			System.out.println("... e meu nome é " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java 2022");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
