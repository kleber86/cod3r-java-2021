package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		//Set<String> conjunto = new HashSet<String>();
		SortedSet<String> conjunto = new TreeSet<>();
		Set<Integer> conjuntoInteiro = new HashSet<Integer>();
		
		conjunto.add("Valor 1");
		conjunto.add("Valor 2");
		
		conjuntoInteiro.add(1);
		conjuntoInteiro.add(2);
		
		for(String valor : conjunto) {
			System.out.println(valor);
		}
		
		for(Integer inteiro : conjuntoInteiro) {
			System.out.println(inteiro);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(200);
		nums.add(60);
		
		for(int n : nums) {
			System.out.println(n);
		}
	}
}
