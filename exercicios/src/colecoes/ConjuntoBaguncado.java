package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add("String");
		conjunto.add(1);
		conjunto.add(2.2999);
		conjunto.add(true);
		
		System.out.println("O tamanho é " + conjunto.size());
		
		conjunto.add("String");
		conjunto.add(true);
		System.out.println("O tamanho é " + conjunto.size());
		
		conjunto.remove(true);
		conjunto.remove("String");
		System.out.println("O tamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(2.2999));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}
