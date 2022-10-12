package ndb.dynamicProgramming;

import java.util.Scanner;

public class 일로만들기 {

	public static int d[] = new int[30000];

	public static void main(String[] args) {
		// a. X / 5
		// b. X / 3
		// c. X / 2
		// d. X - 1
		// a,b,c,d를 최소한의 연산을 통해 X를 1로 만들어라

		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();

		// 다이나믹 프로그래밍(Dynamic Programming) 진행(보텀업)
		for (int i = 2; i <= X; i++) {
			// 현재의 수에서 1을 빼는 경우
			d[i] = d[i - 1] + 1;
			// 현재의 수가 2로 나누어 떨어지는 경우
			if (i % 2 == 0)
				d[i] = Math.min(d[i], d[i / 2] + 1);
			// 현재의 수가 3으로 나누어 떨어지는 경우
			if (i % 3 == 0)
				d[i] = Math.min(d[i], d[i / 3] + 1);
			// 현재의 수가 5로 나누어 떨어지는 경우
			if (i % 5 == 0)
				d[i] = Math.min(d[i], d[i / 5] + 1);
		}

		  System.out.println(d[X]);
		  
	}

}
