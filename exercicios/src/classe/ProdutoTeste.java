package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "Caneta Azul";
		p1.preco = 1.99;
		p1.desconto = 0.10;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 2.10;
		p2.desconto = 0.15;
		
		System.out.println("Produto 1: " + p1.nome);
		System.out.println("Produto 2: " + p2.nome);
		
		double valorComDesconto1 = p1.precoComDesconto();
		double valorComDesconto2 = p2.precoComDesconto(0.1);
		double mediaValores = (valorComDesconto1 + valorComDesconto2) / 2;
		
		
		System.out.println("Valor Produto 1 R$ : " + valorComDesconto1);
		System.out.println("Valor Produto 2: R$ " + valorComDesconto2);
		System.out.println("Media dos valores: R$ " + mediaValores);
	}
}
