package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 9.0);
		Aluno a2 = new Aluno("Gui", 8.1);
		Aluno a3 = new Aluno("Bia", 5.3);
		Aluno a4 = new Aluno("Dan", 2.1);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		Function<Aluno, String> saudacao = a -> "Parabéns " + a.nome + "!!!";
		
		alunos.stream()
			.filter(aprovados)
			.map(saudacao)
			.forEach(System.out::println);
	}

}
