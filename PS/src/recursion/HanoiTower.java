package recursion;

import java.util.Scanner;

public class HanoiTower {
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sb.append((int) (Math.pow(2, N) - 1)).append('\n');
		System.out.print(sb);
		move(N, 1, 3, 2); //

	}

	private static void move(int N, int start, int end, int sub) {
		int cnt = 0;
		if (N == 1) {
			System.out.println(start + " " + end);
			return;
		}

		move(N - 1, start, sub, end); // N-1개를 목표 지점이 아닌 타워에다가 옮겨 놔야 가장 큰 원판을 옮길 수 있겠죠?
		move(1, start, end, sub); // 위에 move 메소드가 끝나면, sub에 나머지 원판이 쌓여있고, 3번 타워에는 비워있게 되어서 바로 큰 원판을 옮기면 된다.
		move(N - 1, sub, end, start); // 아까 옮겨 놓았던 원판을 다시 sub -> end 타워로 옮기는 호출을 한다.
	}
}
