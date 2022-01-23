package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada(int dia, int mes, int ano) {
		String data = dia+"/"+mes+"/"+ano;
		return data;
	}

	String obterDataFormatada2() {
		return String.format("%d-%d-%d", dia, mes, ano);
	}
}
