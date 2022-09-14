package ndb.sort;

import java.util.Arrays;
import java.util.Scanner;

public class 두배열의원소교체 {
	// 배열 A, B 는 N개의 원소로 구성되어 있음
	// 배열은 모두 자연수
	// 최대 K번 바꿔치기 연산을 수행하여 A와 B의 원소를 바꿀 수 있음
	// 배열 A의 원소의 합이 최대가 되도록 하는 것이 목표

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
//		scan.nextLine();
		int A[] = new int[N];
		int B[] = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		for (int i = 0; i < N; i++) {
			B[i] = scan.nextInt();
		}

		Arrays.sort(A);
		Arrays.sort(B);

		for (int i = 0; i < K; i++) {
			if (A[i] < B[N - i - 1]) {
				int temp = A[i];
				A[i] = B[N - i - 1];
				B[N - i - 1] = temp;
			}
			// 정렬이 된 배열이기 때문에 if문에 걸리지 않는다면 다음 반복문 또한 A의 배열이 B의 배열보다 큰 것이 당연하므로 continue가 아니라 break; 처리를 해준다.
			else break; 
		}
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += A[i];
		}
		System.out.println(sum);
	}
}
