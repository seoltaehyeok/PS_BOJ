package ndb.binarysearch;

import java.util.Arrays;
import java.util.Scanner;


// 부품 N개
// 각 부품은 정수 형태의 고유 번호
// M개 종류의 부품을 대량구매
// 가게 안에 부품이 있는지 확인하는 프로그램
public class 부품찾기 {
	public static int binarySearch(int[] arr, int target, int start, int end) {
		if (start > end)
			return -1;

		int mid = (start + end) / 2;

		if (target == arr[mid])
			return mid;

		else if (target > arr[mid]) {
			return binarySearch(arr, target, mid + 1, end);
		} else if (target < arr[mid]) {
			return binarySearch(arr, target, start, mid - 1);
		}
		return -1;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int arrN[] = new int[N];

		for (int i = 0; i < N; i++) {
			arrN[i] = scan.nextInt();
		}
		Arrays.sort(arrN);
		int M = scan.nextInt();
		int arrM[] = new int[M];

		for (int i = 0; i < M; i++) {
			arrM[i] = scan.nextInt();
		}
		for (int i = 0; i < M; i++) {
			// 해당 부품이 존재하는지 확인
			int result = binarySearch(arrN, arrM[i], 0, N - 1);
			if (result != -1) {
				System.out.print("yes ");
			} else {
				System.out.print("no ");
			}
		}
	}

}
