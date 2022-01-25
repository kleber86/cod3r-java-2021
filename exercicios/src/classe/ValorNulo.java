package classe;

public class ValorNulo {
	public static void main(String[] args) {
		String a = "";
		System.out.println(a.concat("!!!"));
		
		Data b = Math.random() < 0.5 ? new Data() : null;
		
		if(b != null) {
			b.mes = 12;
			System.out.println(b.obterDataFormatada2());
		}
		
		String c = Math.random() < 0.5 ? "Opa!!!!" : null;
		System.out.println(c);
	}
}
