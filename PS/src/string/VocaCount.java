package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class VocaCount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String S = in.nextLine();
		
		// 공백을 기준으로 나눈 토큰들을 st에 저장
		StringTokenizer st = new StringTokenizer(S);
		//StringTokenizer st = new StringTokenizer(S, " ");
		
		
		// 토큰의 개수를 반환
		System.out.println(st.countTokens());
	}
}
