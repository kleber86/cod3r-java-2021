package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Pedro"));
		lista.add(new Usuario("Bia"));
		
		System.out.println(lista.get(2));
		
		System.out.println("Remove pelo index: " + lista.remove(0));
		System.out.println("Remove pelo objeto (Bia): " + lista.remove(new Usuario("Bia")));
		System.out.println("Consulta na lista (Pedro): " + lista.contains(new Usuario("Pedro")));
		
		for(Usuario u : lista) {
			System.out.println(u);
		}

	}

}
