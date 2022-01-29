package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> conjunto = new LinkedList<>();
		
		conjunto.add("Bia");
		conjunto.offer("Ana");
		conjunto.add("Carlos");
		conjunto.offer("José");
		
		System.out.println(conjunto.peek()); // Em caso de fila vazia retorna null.
		System.out.println(conjunto.element()); // Em caso de fila vazia retorna um erro.
		System.out.println(conjunto.isEmpty());
		System.out.println(conjunto.size());
		System.out.println(conjunto.poll()); // Chama o primeiro elemento da fila removendo. Bia
		System.out.println(conjunto.poll()); // Chama o primeiro elemento da fila removendo. Ana
	}

}
