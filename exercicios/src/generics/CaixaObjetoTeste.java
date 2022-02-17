package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.aguardar(2.3);
		
		Integer coisa = (Integer) caixaA.abrir();
		System.out.println(coisa);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.aguardar("Olá");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
	}
}
