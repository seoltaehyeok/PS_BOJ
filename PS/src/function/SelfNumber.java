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
//모든 값은 return이 되겠지만 1~10000이 전부 리턴되지않음
//리턴 된 값들은 생성자가 있는 숫자들(ex.30을 넣으면 30+0+3을통해 33이됨)
//20을 return해주고 싶지만 어떤 수를 넣어도 20을 return 할 수 없음
//따라서 받은 모든 값을을 값이 아닌 인덱스로 지정하고
//해당 인덱스에 해당하는 값은 true를 출력
//해당 인덱스에 해당하지 않은 값은 false를 출력하여
//해당 ![false]인 경우만 i의 값 출력하여 해당 값을 제공
// 값->인덱스화 -> 인덱스->값 화

