package rainDrop;

public class Factorial {
	public static void Factorial(int num) {
		int result[] = new int[1000];
		result[0] = 1;
		int n = num;
		int carry = 0;    //进位
		int length = 1;   //结果长度
		int last =0;      //当前运算位
		int i,j;
		for(i = 1;i <= n;i++) {
			for(j = 0;j <= length;j++) {
				last = result[j]*i+carry;
				result[j] = last % 10;
				carry = last / 10;
			}
			while(carry>0){        //循环进位 进位数可能为多位
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




