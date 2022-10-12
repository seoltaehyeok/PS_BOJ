package ndb.dynamicPrograming;

import java.util.Scanner;

public class 개미전사 {

	// 입력 값 N = 5
	// 입력 배열 arr = {1, 4, 8, 9, 2}
	// d[0] = 1
	// d[1] = 1 <> 4
	// d[2] = 4 <> 9
	// d[3] = 9 <> 13
	// d[4] = 13 <> 11
	public static int D[] = new int[100];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); // 식량 창고 개수
		int[] arr = new int[N]; // 식량 저장 공간

		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}

		// 다이나믹 프로그래밍(Dynamic Programming) 진행(보텀업)
		D[0] = arr[0];	// 1
		D[1] = Math.max(arr[0], arr[1]);	// 4

		for (int i = 2; i < N; i++) {
			D[i] = Math.max(D[i - 1], D[i - 2] + arr[i]);
			// d[2] = 4 <> 9
			// d[3] = 9 <> 13
			// d[4] = 13 <> 11
		}

		System.out.println(D[N - 1]);

	}

}
