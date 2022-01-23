package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data(01, 01, 2022);

		
		System.out.println(d1.obterDataFormatada2());
		System.out.println();
		System.out.println(d2.obterDataFormatada2());
	}
}
