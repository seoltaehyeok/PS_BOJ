package string;

import java.util.Scanner;

public class GroupVocaChecker {
	// 같은 단어가 아니거나, 같은단어면 연속적이어야 한다.
	// 만약 같은단어가 불연속적으로 등장했을 경우는 그룹단어로 포함하지 않는다.
	static Scanner sn = new Scanner(System.in);
	public static void main(String[] args) {
		int count = 0;
		int N = sn.nextInt();
		for (int i = 0; i < N; i++) {
			if (check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}

	// 그룹단어인지 아닌지 판단
	public static boolean check() {
		boolean[] check = new boolean[26]; // a~z 26개
		int prev = 0;
		String str = sn.next();

		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);

			if (prev != now) {

				if (check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
				}

				else {
					return false; // 이전 값이랑 같이 않은데 이미 있었던 값이면 false
				}
			}

			else {
				continue; // 이전 값과 현재 값이 같은 경우 계속 반복
			}
		}
		return true; // 반복을 다 돌았을 때 필터되지 않았다면 true
	}
}