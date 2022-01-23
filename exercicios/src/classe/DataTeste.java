package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.dia = 20;
		d1.mes = 01;
		d1.ano = 2000;
		
		Data d2 = new Data();
		d2.dia = 01;
		d2.mes = 01;
		d2.ano = 2000;
		
		System.out.printf(d1.obterDataFormatada(10, 10, 2010));
		System.out.println();
		System.out.println(d2.obterDataFormatada2());
	}
}
