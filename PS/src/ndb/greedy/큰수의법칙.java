package ndb.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 큰수의법칙 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); // 입력 받은 숫자 배열 크기
		int M = scan.nextInt(); // 총 M번 더하기
		int K = scan.nextInt(); // K번째는 중복될 수 없음
		int sum = 0;
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();

		}
		Arrays.sort(arr);
		int second = arr[N - 2];
		int first = arr[N - 1];

		for (int i = 0; i < M; i++) {
			if (i % K == 0 && i != 0) {
				sum += second;
			} else {
				sum += first;
			}
		}
		System.out.println(sum);

		// 5 8 3
		// 2 4 5 4 6
		// 6 + 6 + 6 + 5 + 6 + 6 + 6 + 5 => 46

	}

}
