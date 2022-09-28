package ndb.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

// N : 떡의 개수
// M : 손님이 가져갈 떡의 길이
// 절단기 높이를 구하라

// 파라메트릭 서치(Parametric Search): 최적화 문제를 결정 문제('예' '아니오')로 바꾸어 해결하는 기법
// 적절한 높이를 찾을 때까지 이진 탐색 수행하여 높이 H를 반복 조정
// '현재 이 높이로 자르면 조건을 만족할 수 있는가?'를 확인한 뒤 조건의 만족 여부('예' '아니오')에 따라서 탐색 범위를 좁혀서 해결
// 절단기의 높이는 0부터 10억까지의 정수 중 하나 => 큰 탐색 범위 => 이진 탐색 떠올려야 함

public class 떡볶이떡만들기 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 떡의 개수
		int m = scan.nextInt(); // 가져가기 위한 떡의 길이

		int arr[] = new int[n];

		
		// 떡의 길이를 입력 받음
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);

		int start = 0;
		int end = arr[n - 1]; // 가장 긴 떡의 길이를 end 값으로 지정

		int result = 0;

		while (start <= end) {
			int sum = 0;
			
			int mid = (start + end) / 2; // 절단기의 길이
			for (int i = 0; i < n; i++) {
				if (arr[i] > mid) { // 현재 떡의 길이가 절단기(mid) 길이보다 길다면
					sum += arr[i] - mid; // 남은 떡의 길이를 모두 더함 (떡의 길이 - 절단한 길이 = 남은 떡의 길이)
				}
			}
			if (sum < m) { // 남은 떡 < 가져가고자 하는 떡
				end = mid - 1;
			} else { // 남은 떡 > 가져가고자 하는 떡
				// 중간 점(mid)의 값은 시간이 지날수록 '최적화된 값'이 되기 때문에,
				// 과정을 반복하면서 얻을 수 있는 떡의 길이 합이 필요한 떡의 길이보다 크거나 같을 때마다 중간점의 값을 기록한다.
				result = mid; 
				start = mid + 1;
			}
		}
		System.out.println(result);

	}

}
