package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Tipos Inteiros
		byte anosDeEmpresa = 20;
		short numerosDeVoos = 500;
		int id = 100;
		long pontosAcumulados = 2_000_000_000L;
		
		// Tipos Numericos
		float salario = 1_000.00F;
		double vendasAcumuladas = 2_999_999_999.01;
		
		// Tipo Booleano
		boolean estaDeFerias = false;
		
		char status = 'A';
		
		// Dias de Empresa
		System.out.println(anosDeEmpresa * 360);
		
		// Numeros de Viagens
		System.out.println(numerosDeVoos * 20);
		
		// Pontos Acumulados
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println("ID " + id);
		System.out.println("Salário: " + salario);
		System.out.println("Férias: " + estaDeFerias);
		System.out.println("Status: " + status);
	}
	
}
