package rainDrop;

public class AplusB {
	public static int aplusb(int a, int b) {
		int xor = 0;
		int and = 0;
		do {
			xor = a^b;       //�������          �����λ�Ӽ�
			and = (a&b)<<1;  //������              �����λ
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
