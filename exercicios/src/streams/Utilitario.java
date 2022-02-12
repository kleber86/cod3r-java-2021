package streams;

import java.util.function.UnaryOperator;

public class Utilitario {
	
	private Utilitario() {};

	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = l -> l.charAt(0) + "";
	public final static String grito(String grito) {
			return grito + "!!! ";
	}
}
