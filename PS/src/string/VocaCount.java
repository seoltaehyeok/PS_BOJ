package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class VocaCount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String S = in.nextLine();
		
		// ������ �������� ���� ��ū���� st�� ����
		StringTokenizer st = new StringTokenizer(S);
		//StringTokenizer st = new StringTokenizer(S, " ");
		
		
		// ��ū�� ������ ��ȯ
		System.out.println(st.countTokens());
	}
}
