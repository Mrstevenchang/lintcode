package rainDrop;

public class AplusB {
	public static int aplusb(int a, int b) {
		int xor = 0;
		int and = 0;
		do {
			xor = a^b;       //异或运算          负责个位加减
			and = (a&b)<<1;  //与运算              负责进位
			a = xor;
			b = and;
		}while(and!=0);
		return xor;
	}
	public static void main(String[] args) {
		int x1 = 19;
		int x2 = 11;
		System.out.print(aplusb(x1,x2));
	}

}
