package rainDrop;

public class Factorial2 {
	public static void getNFactorial(int n) {
        int num[] = new int[1000];
        int i, j;
        if (n == 1 || n == 0) {
            System.out.println(1);
        } else {
            int p, h;// p ��ŵ�ǰ�����λ����hΪ��λ��
            p = 1;
            h = 0;
            num[1] = 1;
            for (i = 2; i <= n; i++) {
                // ʹ��a[]��ÿλ��i���
                for (j = 1; j <= p; j++) {
                    num[j] = num[j] * i + h;
                    h = num[j] / 10;
                    num[j] = num[j] % 10;
                }
                // ��ʾ���µ�λ�ý�λ
                while (h > 0) {
                    num[j] = h % 10;
                    h = h / 10;
                    j++;
                }
                p = j - 1;
            }
            for (i = p; i >= 1; i--) {
                System.out.print(num[i]);
            }
        }
    }
	public static void main(String[] args) {
		int num = 15;
		getNFactorial(num);
	}

}
