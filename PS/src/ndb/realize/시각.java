package ndb.realize;

import java.util.Scanner;

public class 시각 {

	public static void main(String[] args) {
		// 정수 N이 입력되면 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 구하는
		// 프로그램
		// 1을 입력했을 때 다음은 3이 하나라도 포함되어 있으므로 세어야 하는 시각이다.
		// 00시 00분 03초, 00시 13분 30초 (o)
		// 00시 02분 55초, 01시 27분 45초 (x)

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int cnt = 0;
		// 완전 탐색 문제
		for (int i = 0; i <= N; i++) { // 시
			for (int j = 0; j < 60; j++) { // 분
				for (int k = 0; k < 60; k++) { // 초
					if (i % 10 == 3) {
						cnt++;
						continue;
					}
					if (j % 10 == 3) {
						cnt++;
						continue;
					}
					if (j / 10 == 3) {
						cnt++;
						continue;
					}
					if (k % 10 == 3) {
						cnt++;
						continue;
					}
					if (k / 10 == 3) {
						cnt++;
						continue;
					}
				}
			}

		}
		System.out.println(cnt);

	}

}
