package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		Byte a = 10;
		Short b = 100;
		Integer c = Integer.parseInt("1000");
		Long d = 10000L;
		
		Float g = 123.123f;
		System.out.println(g);
		
		Double h = 1234.5678;
		System.out.println(h);
		
		System.out.println(a.byteValue());
		System.out.println(b.toString());
		System.out.println(c * 3);
		System.out.println(d  / 2);
		
		Boolean e = Boolean.parseBoolean("true");
		System.out.println(e);
		System.out.println(e.toString().toUpperCase());
		
		Character f = '#';
		System.out.println(f.toString());
	}
}
