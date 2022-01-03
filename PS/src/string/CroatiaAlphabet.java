package string;

import java.util.Scanner;

public class CroatiaAlphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int len = str.length();
		int count = 0;

		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);

			if (ch == 'c') { 						// 현재 값이 c이고
				if (i < len - 1) { 					// 다음 배열의 칸이 있을 때
					if (str.charAt(i + 1) == '=') { // 다음 값이 = 이면
						i++; 						// i를 증가 시키세요
					} else if (str.charAt(i + 1) == '-') { // 그게 아니라 다음 값이 - 이면
						i++;						// i를 증가 시키세요
					}
				}
			}

			else if (ch == 'd') {					// 현재 값이 d이고
				if (i < len - 1) {					// 다음 배열의 칸이 있을 때
					if (str.charAt(i + 1) == 'z') {	// 다음 값이 z 이면
						if (i < len - 2) {			// 다다음 배열의 칸이 있을 때
							if (str.charAt(i + 2) == '=') {	// 다다음 값이 = 이면
								i += 2;				// i를 2 증가 시키세요 ( dz- 인 경우 )
							}
						}
					}
					if (str.charAt(i + 1) == '-') {	// 그게 아니라 다다음 값이 - 이면
						i++;						// i를 증가 시키세요 ( d- 인 경우 )
					}
				}
			}

			else if (ch == 's') {
				if (i < len - 1) {
					if (str.charAt(i + 1) == '=') {
						i++;
					}
				}
			}

			else if (ch == 'z') {
				if (i < len - 1) {
					if (str.charAt(i + 1) == '=') {
						i++;
					}
				}
			}

			else if (ch == 'l') {
				if (i < len - 1) {
					if (str.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}

			else if (ch == 'n') {
				if (i < len - 1) {
					if (str.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}
			count++; // if와 else에 걸리게 되면 i값을 증가해서 그만큼 i의 범위를 줄임 => count할 수 있는 양을 줄임
		}
		System.out.println(count);
	}
}
