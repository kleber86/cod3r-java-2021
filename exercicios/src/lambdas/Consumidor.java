package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 1.99, 0.1);
		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Lapis", 0.99, 0.18);
		Produto p3 = new Produto("Borracha", 1.99, 0.10);
		Produto p4 = new Produto("Caderno", 2.99, 0.5);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
	}

}
