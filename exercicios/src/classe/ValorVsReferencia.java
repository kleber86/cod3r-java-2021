package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2.0;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " - " + b);
		
		Data d1 = new Data();
		Data d2 = d1;
		
		d1.dia = 1;
		d2.mes = 2;
		d2.ano = 2025;
		
		System.out.println(d1.obterDataFormatada2());
		System.out.println(d2.obterDataFormatada2());
		
		retornarDataValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada2());
		System.out.println(d2.obterDataFormatada2());
		
		int c = 5;
		adicionarPrimitivo(c);
		System.out.println(c);
	}
	
	static void retornarDataValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void adicionarPrimitivo(int a) {
		a++;
	}
}
