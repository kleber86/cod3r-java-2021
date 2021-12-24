package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {		
		final double FATOR = 5 / 9.0;
		final double AJUSTE = 32;
		
		double fahrenheint = 86;
		double celcius = (fahrenheint - AJUSTE) * FATOR;
		System.out.println("o RESULTADO É: " + celcius);
		
		fahrenheint = 0;
		celcius = (fahrenheint - AJUSTE) * FATOR;
		System.out.println("o RESULTADO É: " + celcius);		
	}

}
