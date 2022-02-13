package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.3);
		Aluno a2 = new Aluno("Gui", 5.1);
		Aluno a3 = new Aluno("Bia", 9.0);
		Aluno a4 = new Aluno("Dan", 10);
		Aluno a5 = new Aluno("Ana", 7.3);
		Aluno a6 = new Aluno("Gui", 5.1);
		Aluno a7 = new Aluno("Bia", 9.0);
		Aluno a8 = new Aluno("Dan", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("Distict");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.skip(2)
			.limit(2)
			.forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		alunos.stream()
			.distinct()
			.skip(2)
			.takeWhile(a -> a.nota >= 7)
			.forEach(System.out::println);
	}
}
