package fundamentos;

public class Aritimeticos {

	public static void main(String[] args) {
		System.out.println(2 + 2);
		
		var a = 23.2;
		double b = 1.2;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a / b);
		System.out.println(a * b);
		
		int c = 10;
		int d = 5;
		System.out.println(c + d);
		System.out.println(c - d);
		System.out.println(c / d);
		System.out.println(c * d);
		System.out.println(c / (double) d);
		
		System.out.println(c % d);
		System.out.println(a % b);
		
		System.out.println(a - b / c * d);
	}
}
