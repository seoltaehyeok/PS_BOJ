package ndb.dynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 문제 설명
// N명의 병사가 무작위로 나열
// 각 병사는 특정한 값의 전투력 보유
// 병사를 배치할 때 전투력이 높은 병사가 앞으로 오게 내림차순 배치
// 특정 위치에 있는 병사는 열외시키면서 남아있는 병사의 수가 최대가 되게끔
// 병사에 대한 정보가 주어졌을 때, 병사의 수가 최대가 되기 위해 열외시켜야 하는 병사의 수를 구하라
// 따라서 내림차순 배치를 하기 위해 병사를 열외시켜야 하고, 열외시키는 병사의 수를 최대한 적게 해야 함
// LIS 알고리즘 (가장 긴 증가하는 부분 수열)을 수정하여 이용
// LIS 알고리즘 점화식: D[i] = max(D[i], D[j] + 1) if arr[j] < arr[i]

// 입력
// 7
// 15 11 4 8 5 2 4
// 출력
// 2

public class 병사배치하기 {

	static int n;
	static ArrayList<Integer> v = new ArrayList<Integer>();
	static int[] dp = new int[2000];
	
	// dp테이블을 남아있는 병사의 수를 구해야 함
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(int i =0 ; i<n; i++) {
			v.add(scan.nextInt());
		}
		// 순서를 뒤집어서 '최장 증가 부분 수열' 문제로 변환
		Collections.reverse(v);
		System.out.println("입력받은 배열 리버스");
		for(int i = 0 ;i<n; i++) {
			System.out.print(v.get(i) + " ");;
		} System.out.println();
		for(int i = 0; i <n; i++) dp[i] = 1;
		
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(v.get(j) < v.get(i)) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		int maxValue = 0;
		for (int i = 0; i<n; i++) {
			maxValue = Math.max(maxValue, dp[i]);
		}
		System.out.println("최소열외개수: " + (n - maxValue));
	}
}
