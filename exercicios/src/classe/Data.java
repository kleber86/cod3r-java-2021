package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
		dia = 1;
		mes = 01;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String obterDataFormatada(int dia, int mes, int ano) {
		String data = dia+"/"+mes+"/"+ano;
		return data;
	}

	String obterDataFormatada2() {
		return String.format("%d-%d-%d", dia, mes, ano);
	}
}
