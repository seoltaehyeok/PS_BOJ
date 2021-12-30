//package function;
//
//public class SelfNumber {
//
//	public static void main(String[] args) {
//		
//		boolean[] check = new boolean[10001];
//		
//		for(int i=1; i<10001; i++) {
//			int n = sum(i);
//			
//			if(n < 10001) {
//				check[n] = true;
//			}
//		}
//		
//		for(int i=1; i<10001; i++) {
//			if(!check[i]) {
//				System.out.println(i);
//			}
//		}
//	}
//	
//	
//	public static int sum(int number) {
//		int sum = number;
//		
//		while(number != 0) {
//			sum += (number % 10);
//			number = number / 10;
//		}
//		return sum;
//	}
//}
//
//
package function;

public class SelfNumber {

	public static void main(String[] args) {
		boolean []arr = new boolean[10001];
		for(int i=1; i<10001; i++) {
			int n = sum(i);
		
			if(n<10001) 
				arr[n] = true;
			}
		
		for(int i=1; i<10001; i++) {
			if(!arr[i]) {
				System.out.println(i);
			}
		}
	
	}
	
	public static int sum(int number) {
		int sum = number;
		
		while(number!=0) {
			sum += (number % 10); 
			number = number / 10; 
		}
		return sum; 
	}
}
//��� ���� return�� �ǰ����� 1~10000�� ���� ���ϵ�������
//���� �� ������ �����ڰ� �ִ� ���ڵ�(ex.30�� ������ 30+0+3������ 33�̵�)
//20�� return���ְ� ������ � ���� �־ 20�� return �� �� ����
//���� ���� ��� ������ ���� �ƴ� �ε����� �����ϰ�
//�ش� �ε����� �ش��ϴ� ���� true�� ���
//�ش� �ε����� �ش����� ���� ���� false�� ����Ͽ�
//�ش� ![false]�� ��츸 i�� �� ����Ͽ� �ش� ���� ����
// ��->�ε���ȭ -> �ε���->�� ȭ

