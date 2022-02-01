package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionaItem(String nome, int quantidade, double preco) {
		this.adicionaItem(new Item(nome, quantidade, preco));
	}
	
	void adicionaItem(Item item) {
		itens.add(item);
		item.compra(this);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
}