package rainDrop;

public class Factorial {
	public static void Factorial(int num) {
		int result[] = new int[1000];
		result[0] = 1;
		int n = num;
		int carry = 0;    //��λ
		int length = 1;   //�������
		int last =0;      //��ǰ����λ
		int i,j;
		for(i = 1;i <= n;i++) {
			for(j = 0;j <= length;j++) {
				last = result[j]*i+carry;
				result[j] = last % 10;
				carry = last / 10;
			}
			while(carry>0){        //ѭ����λ ��λ������Ϊ��λ
				result[j] = carry % 10 ;
				carry = carry / 10;
				j++;
			}
			length = j-1;
		}	
		for(int a = length;a >= 0;a--) {
			System.out.print(result[a]);
		}
	}
	
	public static void main(String[] args) {
		int num = 99;
		Factorial(num);
	}
	

}




