package ndb.sort;

import java.util.Scanner;

public class 위에서아래로 {
	// 수열을 내림차순으로 정렬하는 프로그램

	public static void quickSort(int[] arr, int start, int end) {
		if (start >= end)
			return;
		int pivot = start;
		int left = start + 1;
		int right = end;

		while (left <= right) {
			while (left <= end && arr[left] >= arr[pivot])
				left++;
			while (right > start && arr[right] <= arr[pivot])
				right--;
			if(left > right) {
				int temp = arr[pivot];
				arr[pivot] = arr[right];
				arr[right] = temp;
			} else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}

		quickSort(arr, start, right - 1);
		quickSort(arr, right + 1, end);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int select[] = new int[n];
		int insert[] = new int[n];
		int quick[] = new int[n];
		for (int i = 0; i < n; i++) {
			select[i] = scan.nextInt();
			insert[i] = select[i];
			quick[i] = select[i];
		}

		// 선택정렬
		for (int i = 0; i < n; i++) {
			int max_index = i;
			for (int j = i + 1; j < n; j++) {
				if (select[max_index] < select[j]) {
					max_index = j;
				}
			}
			int temp = select[max_index];
			select[max_index] = select[i];
			select[i] = temp;
		}

		// 삽입정렬
		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (insert[j] > insert[j - 1]) {
					int temp = insert[j];
					insert[j] = insert[j - 1];
					insert[j - 1] = temp;
				}
			}
		}

		// 퀵 정렬
		quickSort(quick, 0, n - 1);

		// 선택정렬
		System.out.println("선택정렬");
		for (int i = 0; i < n; i++) {
			System.out.print(select[i] + " ");
		}

		// 삽입정렬
		System.out.println("\n삽입정렬");
		for (int i = 0; i < n; i++) {
			System.out.print(insert[i] + " ");
		}
		// 퀵 정렬
		System.out.println("\n퀵 정렬");
		for (int i = 0; i < n; i++) {
			System.out.print(quick[i] + " ");
		}
	}
}
