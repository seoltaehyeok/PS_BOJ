package ndb.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 숫자카드게임 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); // 행의 개수
		int M = scan.nextInt(); // 열의 개수
		int arr[] = new int[M];
		int min[] = new int[N];
		// 뽑고자 하는 카드가 포함되어 있는 행 선택
		
		// 선택된 행에 포함된 카드들 중 가장 숫자가 낮은 카드를 뽑기
		
		// 따라서 각 행에서 최소값을 비교하여 그 중 높은 값을 찾을 수 있는 행을 뽑아야 함 => 각 행의 최소값 중 최대값
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				arr[j] = scan.nextInt();
			}
			Arrays.sort(arr);
			min[i] = arr[0];
		}
		Arrays.sort(min);
		System.out.println(min[N-1]);
		
		
		
		
		

	}

}
