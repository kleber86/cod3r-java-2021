package arrays;

public class Foreach {

	public static void main(String[] args) {
		int[] notas = {1, 2, 3, 4, 5, 6, 7};
		
		for (int nota : notas) {
			System.out.print(nota + " ");
		}
		
		System.out.println();
		
		String[] frutas = { "uva", "banana", "laranja", "abacate"};
		
		for(String fruta : frutas) {
			System.out.print(fruta + " - ");
		}
	}
}
