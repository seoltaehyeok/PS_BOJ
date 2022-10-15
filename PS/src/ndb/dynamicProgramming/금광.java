package ndb.dynamicProgramming;

import java.util.Scanner;

// 문제설명
// n x m 크기의 금광 크기는 1:1
// 각 칸은 특정 크기의 금이 들어있음
// 첫번째 열, 아무 행에서 출발하여 다음 열의 위, 중간, 아래 3방향으로 갈 수 있다.
// m-1까지 이동이 가능하고 최대한으로 얻을 수 있는 금의 크기는?

// solution
// a. 왼쪽 위에서 오는 경우
// b. 왼쪽 아래에서 오는 경우
// c. 왼쪽에서 오는 경우 총 3가지를 고려해서 optimal solution값을 구한다.
// arr[i][j] = i행 j열에 존재하는 금의 양
// dp[i][j] = i행 j열 까지의 최적의 해
// 점화식 : dp[i][j] = arr[i][j] + max(dp[i-1][j-1], dp[i][j-1], dp[i+1][j-1])
// 리스트의 범위를 벗어나지 않은지 확인해야 함

// 입력 예시
// 2
// 3 4
// 1 3 3 2 2 1 4 1 0 6 4 7
// 4 4
// 1 3 1 5 2 2 4 1 5 0 2 3 0 6 1 2
// 출력 예시
// 19
// 16
public class 금광 {

	public static int testCase, n, m;
	public static int arr[][] = new int[20][20];
	public static int dp[][] = new int[20][20];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		testCase = scan.nextInt();

		for (int tc = 0; tc < testCase; tc++) {
			n = scan.nextInt();
			m = scan.nextInt();

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					arr[i][j] = scan.nextInt();
				}
			}
			// 다이나믹 프로그래밍을 위한 2차원 DP 테이블 초기화
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					dp[i][j] = arr[i][j];
				}
			}
			// 다이나믹 프로그래밍 진행
			for (int j = 1; j < m; j++) {
				for (int i = 0; i < n; i++) {
					int leftUp, left, leftDown;
					// 왼쪽 위에서 오는 경우
					if (i == 0)
						leftUp = 0; // 현재 i가 0이라면(첫번째 행이라면) leftUp은 존재x
					else
						leftUp = dp[i - 1][j - 1]; // 직전 위치 값
					// 왼쪽 아래에서 오는 경우
					if (i == n - 1)
						leftDown = 0; // 현재 i가 n-1이라면(마지막 행이라면) leftDown은 존재x
					else
						leftDown = dp[i + 1][j - 1]; // 직전 위치 값
					// 왼쪽에서 오는 경우
					left = dp[i][j - 1]; // 직전 위치 값
					dp[i][j] = dp[i][j] + Math.max(leftUp, Math.max(leftDown, left)); // optimal solution 값 = 현재위치 값 +
																						// 이전 열의 a,b,c 값 중 큰 값
				}
			}
			int result = 0;
			for (int i = 0; i < n; i++) {
				result = Math.max(result, dp[i][m - 1]); // 마지막 열의 optimal solution 값을 비교하여 가장 큰 수를 result에 담음
			}

			System.out.println(result);
		}
	}
}
