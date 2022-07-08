package sort;

import java.util.Scanner;

public class QuickSort {
//	* 실무에서 가장 많이 사용하는 정렬
//	  * 일반적/범용적으로 가장 빠름
//	* 분할 정복 알고리듬
//	  * 모든 요소를 방문
//	  * 복잡도에 log가 있음
//	* 어떤 값(pivot)을 기준으로 목록을 하위 목록 2개로 나눔
//	  * 목록을 나누는 기준은 pivot보다 작거나 큰 것으로 나눔
//	  * 이 과정을 재귀적으로 반복
//	  * 재귀 단계가 깊어질 때마다 새로운 pivot 값을 뽑음

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		pivot(arr, 0, arr.length - 1);

		for (int i = 0; i < N; i++)
			System.out.println(arr[i]);
	}

	public static int[] pivot(int[] arr, int left, int right) {
		if (left >= right) {
			return null;
		}
		int pivotPos = partition(arr, left, right); // left: 0 / right: 10일 때 pivotPos가 6이라면

		pivot(arr, left, pivotPos - 1); // left: 0 / pivotPos-1: 5
		pivot(arr, pivotPos + 1, right); // pivotPos+1: 7 / right: 10

		return arr;

	}

	public static int partition(int[] arr, int left, int right) {

		int i = left - 1;
		int pivot = arr[right];
		for (int j = left; j < right; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		int pivotPos = i + 1;
		swap(arr, pivotPos, right);
		return pivotPos;
	}

	public static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;

	}

}
