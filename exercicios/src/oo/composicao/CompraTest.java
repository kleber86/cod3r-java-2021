package oo.composicao;

public class CompraTest {

	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.cliente = "Ana";
		compra1.adicionaItem("Lapis", 10, 1.99);
		compra1.adicionaItem(new Item("Borracha", 10, 0.99));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
	}

}
