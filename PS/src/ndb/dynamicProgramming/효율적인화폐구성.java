package ndb.dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class 효율적인화폐구성 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 화폐의 개수
		int m = scan.nextInt(); // 총 값

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int d[] = new int[m+1];
		Arrays.fill(d, 10001); // 총 가격의 범위를 벗어나게 끔 설정 INF

		d[0] = 0;	// 값이 0이 되려면 최소한의 화폐개수는 0이다.
		// i는 입력받은 화폐의 단위가 됨
		// j는 입력받은 화폐로부터 총 값까지
		for (int i = 0; i < n; i++) {
			for (int j = arr[i]; j <= m; j++) {
				if (d[j - arr[i]] != 10001) {	// d[K1 - K1] = d[0]이므로 true가 됨
					d[j] = Math.min(d[j], d[j- arr[i]] + 1);	// 기존값과 직전값+1을 비교
				}
			}
		}
		
		// d[m]이 담고자 하는 값 : 값 m이 되기 위한 최소한의 화폐 개수
		if(d[m] == 10001) {
			System.out.println(-1);
		} else
			System.out.println(d[m]);
	}
}
