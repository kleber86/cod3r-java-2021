package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	public final String nome;
	public List<Curso> cursos = new ArrayList<>();
	
	public Aluno(String nome){
		this.nome = nome;
	}
	
	public void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	public String toString() {
		return nome;
	}
	
	public Curso obterCursoPorNome(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
}
