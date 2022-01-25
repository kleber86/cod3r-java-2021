package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
		//dia = 1;
		//mes = 01;
		//ano = 1970;
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada(int dia, int mes, int ano) {
		String data = dia+"/"+mes+"/"+ano;
		return data;
	}

	String obterDataFormatada2() {
		final String formato = "%d-%d-%d";
		return String.format(formato, dia, mes, ano);
	}
}
