package rainDrop;

public class TrailingZero {
	public long TrailingZeros(long num) {
		long n = num;
		long temp = n / 5;
		long count = 0;
		while(temp!=0) {
			count += temp;
			temp = temp / 5;
		}
		return count;
	}

}


