package ndb.dynamicProgramming;

public class 피보나치탑다운 {
	public static long[] d = new long[51];

	public static long fibo(int x) {
		if (x == 1 || x == 2) {
			return 1;
		}
//		이미 d[x]에 값이 저장되어 있다면 return d[x] 
//		=> f(4)를 호출하려면 f(3)과 f(2)를 호출해야 하지만 f(3)은 f(2)+f(1)이므로 f(4)를 호출할 때 f(2)가 두 번 재귀 도는 것을 방지
		if (d[x] != 0) {
			return d[x];
		}
		d[x] = fibo(x - 2) + fibo(x - 1);
		return d[x];
	}

	public static void main(String[] args) {
		System.out.println(fibo(50));
	}
	// 피보나치 함수(Fibonacci Function)을 재귀함수로 구현
//	public static int fibo(int x) {
//		if (x == 1 || x == 2) {
//			return 1;
//		}
//		return fibo(x - 1) + fibo(x - 2);
//	}
//
//	public static void main(String[] args) {
//		System.out.println(fibo(4));
//	}
}
