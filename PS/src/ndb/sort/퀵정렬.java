package ndb.sort;

public class 퀵정렬 {

	// pivot: index 0에 위치한 값
	// left: pivot + 1에 위치한 값
	// right: end 값
	// 배열의 왼->오 순서대로 pivot값 보다 큰 값을 찾아야 하고
	// 배열의 오->왼 순서대로 pivot값 보다 작은 값을 찾아야 한다.
	// 만일 찾았다면 left의 위치해 있는 값과 right에 위치해 있는 값을 맞바꾼다.
	// 만일 찾았는데 left의 위치가 right의 위치보다 큰 수에 위치한다면 left의 값과 pivot의 값을 서로 맞바꾼다. part1완료
	public static void quickSort(int[] arr, int start, int end) {
		if (start >= end) // 정렬할 원소가 더 이상 없음 (원소 1개)
			return;
		int pivot = start;
		int left = start + 1;
		int right = end;

		while (left <= right) {
			// 피벗보다 큰 데이터를 찾을 때까지 반복
			while (left <= end && arr[left] <= arr[pivot])
				left++;
			// 피벗보다 작은 데이터를 찾을 때까지 반복
			while (right > start && arr[right] >= arr[pivot])
				right--;
			// 엇갈렸다면 작은 데이터와 피벗을 교체
			if (left > right) {
				int temp = arr[pivot];
				arr[pivot] = arr[right];
				arr[right] = temp;
			}
			// 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교체
			else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		// 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
		quickSort(arr, start, right - 1);
		quickSort(arr, right + 1, end);
	}

	public static void main(String[] args) {
		int n = 10;
		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		quickSort(arr, 0, n - 1);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
