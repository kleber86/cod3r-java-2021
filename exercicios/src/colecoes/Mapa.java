package colecoes;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Ana");
		usuarios.put(2, "Bia");
		usuarios.put(3, "José");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(1));
		System.out.println(usuarios.containsKey("Ana"));
		
		for(int i : usuarios.keySet()) {
			System.out.println(i);
		}
		
		for(String i : usuarios.values()) {
			System.out.println(i);
		}
		
		for(Entry<Integer, String> i : usuarios.entrySet()) {
			System.out.println(i.getKey() + " - " + i.getValue());
		}
	}

}
