package ndb.dynamicProgramming;

public class 피보나치바텀업 {
	public static long[] d = new long[100];

	public static void main(String[] args) {
		d[1] = 1;
		d[2] = 1;
		int n = 50; // 50번째 피보나치를 계산하고자 할 때
		
		for(int i=3; i<=n; i++) {
			d[i] = d[i-1] + d[i-2];
		} 
		System.out.println(d[n]);
	}
}
