package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Exercicio {

	public static void main(String[] args) {
		double[] a = new double[3];
		
		System.out.println(Arrays.toString(a));
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		
		System.out.println(Arrays.toString(a));
		
		double total = 0;
		for(int i = 0; i < a.length; i++) {
			total += a[i];
		}
		
		System.out.println(total / a.length);

		final double c = 8;
		double[] b = {4, 5, 6, 7, c};
		
		double totalB = 0;
		for (int i = 0; i < b.length; i++) {
			totalB += b[i];	
		}
		
		System.out.println(totalB / b.length);
	}

}
