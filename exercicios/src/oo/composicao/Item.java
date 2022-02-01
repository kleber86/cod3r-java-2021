package oo.composicao;

public class Item {

	String nome;
	int quantidade;
	Double preco;
	Compra compra;
	
	Item(String nome, int quantidade, Double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public void compra(Compra compra) {
		// TODO Auto-generated method stub
		
	}
}
