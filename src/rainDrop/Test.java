package rainDrop;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		TrailingZero t = new TrailingZero();
		Scanner scanner = new Scanner(System.in);
		long result = t.TrailingZeros(scanner.nextLong());
		System.out.println(result);
		
	}
}
