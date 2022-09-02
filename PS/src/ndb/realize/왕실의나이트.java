package ndb.realize;

import java.util.Scanner;

public class 왕실의나이트 {
	public static void main(String[] args) {
		// 1. 수평으로 두 칸 이동한 뒤에 수직으로 한 칸 이동하기
		// 2. 수직으로 두 칸 이동한 뒤에 수평으로 한 칸 이동하기
		// 8x8의 좌표에서 나이트의 위치가 주어졌을 때 이동할 수 있는 경우의 수를 출력하시오

		Scanner scan = new Scanner(System.in);
		String inputData = scan.nextLine();

		int row = inputData.charAt(1) - '0'; // 1-0 = 1
		int column = inputData.charAt(0) - 'a' + 1; // a-a = 0 => 0 +1 = 1

		int[] dx = { -2, -2, 2, 2, -1, 1, -1, 1 };
		int[] dy = { -1, 1, -1, 1, -2, -2, 2, 2 };
		
		int result = 0;
		
		for(int i=0; i<8; i++) {
			int nextRow = row + dx[i];
			int nextCol = column + dy[i];
			
			if(nextRow >= 1 && nextRow <=8 && nextCol >=1 && nextCol <=8) {
				result++;
			}
		}
		System.out.println(result);

		// 행2칸 열1칸
//		row = [(-2,-1), (-2,1), (2, -1), (2, 1)];
//		// 행1칸 열2칸
//		column = [(-1, -2), (1, -2), (-1,2), (1,2)];
//		
	}
}
