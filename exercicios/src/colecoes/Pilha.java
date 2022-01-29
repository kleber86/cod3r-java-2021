package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> conjunto = new ArrayDeque<>();
		conjunto.add("O Silmarilion");
		conjunto.add("O Hobbit");
		conjunto.push("O Senhor dos Aneis - A Sociedade do Anel");
		
		
		System.out.println(conjunto);
		System.out.println(conjunto.size());
		System.out.println(conjunto.isEmpty());
		
		for(String livro : conjunto) {
			System.out.println(livro);
		}
		
		System.out.println(conjunto.peek());
		System.out.println(conjunto.poll());
		System.out.println(conjunto.pop());
		System.out.println(conjunto);

	}

}
