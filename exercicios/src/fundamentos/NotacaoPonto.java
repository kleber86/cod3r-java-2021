package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		String texto = "Bom dia, X";
		texto = texto.replace("X", "Sra");
		texto = texto.toUpperCase();
		
		System.out.println(texto);
		
		String textoBoaTarde = "Boa tarde, X";
		textoBoaTarde = textoBoaTarde
					.replace("X", "Sr")
					.concat("!!")
					.toUpperCase();
		System.out.println(textoBoaTarde);
		
		String textoBoaNoite = "Boa noite, Y"
				.replace("Y", "X")
				.concat("!")
				.toUpperCase();
		
		System.out.println(textoBoaNoite);
	}
}
