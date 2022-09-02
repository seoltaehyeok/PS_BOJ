package ndb.realize;

import java.util.Scanner;

public class 상하좌우 {

	public static void main(String[] args) {
		// 공간의 크기를 나타내는 N * N
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
	    scan.nextLine(); // 버퍼 비우기
		// 입력 값은 1보다 크고 100보다 작다
		String[] plans = scan.nextLine().split(" ");
		int x = 1;
		int y = 1;

		int[] dx = { 0, 0, -1, 1 }; // 좌우상하 기준 행의 좌우는 움직이지 않음
		int[] dy = { -1, 1, 0, 0 }; // 좌우상하 기준 열의 상하는 움직이지 않음
		char[] moveType = { 'L', 'R', 'U', 'D' };

		for (int i = 0; i < plans.length; i++) { // 입력한 문자열의 길이
			char plan = plans[i].charAt(0); // String 배열의 각 원소를 char형으로 바꿈
			int nx = -1;
			int ny = -1;

			for (int j = 0; j < 4; j++) { // L R U D 상하좌우 이동 가능
				if (plan == moveType[j]) {
					nx = x + dx[j];
					ny = y + dy[j];
				}
			}
			
			// 공간을 벗어나는 경우 무시
			 if (nx < 1 || ny < 1 || nx > N || ny > N) continue; // 이동하려는 갑이 (1,1)보다 작거나 (N,N)보다 크다면 무시하고 진행
	            // 이동 수행 
	            x = nx;
	            y = ny;
		}

		System.out.println(x + " " + y);
		// 입력 값을 스플릿을 통해 한 단어씩 자른다.
		// 입력 값의 총 길이만큼 반복문을 돌린다.
		// 반복문의 내용은 L R U D 에 대한 내용으로
		// L일 경우 -1 R일 경우 +1
		// U일 경우 -1 D일 경우 +1 을 해서 최종적인 (x,y)를 만든다.
	}

}
