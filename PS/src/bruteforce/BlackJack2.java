package bruteforce;

import java.util.Scanner;

public class BlackJack2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		int result = pick(arr, N, M);
		System.out.println(result);

	}

	static int pick(int[] arr, int N, int M) {
		int result = 0;
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					int temp = arr[i] + arr[j] + arr[k];
					if (temp == M) {
						return temp;
					}
					if (result < temp && temp < M) { // 조건에 만족하지 않는다는건 M보다 temp가 커졌다는 의미 즉, 직전 값은 result에 저장됨
						result = temp;
					}
				}
			}
		}
		return result;
	}
}
