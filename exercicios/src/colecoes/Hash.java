package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("User 1"));
		usuarios.add(new Usuario("User 2"));
		usuarios.add(new Usuario("User 3"));
		
		System.out.println(usuarios.contains(new Usuario("User 3")));
	}
}
