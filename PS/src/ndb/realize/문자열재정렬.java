package ndb.realize;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열재정렬 {

	public static void main(String[] args) {
		// 알파벳 대문자와 숫자(0~9)로만 구성된 문자열이 입력으로 주어짐
		// 이때 알파벳을 오름차순으로 정렬하고 출력한뒤 뒤에 모든 숫자를 더한 값을 출력
		// ex) K1KA5CB7 -> ABCKK13
		
		// 문자열 입력
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		int len = text.length();
		char[] txt = new char[len];
		char[] newTxt = new char[len];
		int sum = 0;
		for(int i=0; i<len; i++) {
			txt[i] = text.charAt(i);
			if(txt[i] >=48 && txt[i] <=57) {
				sum += txt[i] -'0';
			}
			else {
				newTxt[i] = text.charAt(i);
			}
		}
		Arrays.sort(newTxt);
		for(int i=0; i<newTxt.length; i++) {
			if(newTxt[i] == 0)
				continue;
			System.out.print(newTxt[i]);
		}
		System.out.println(sum);

	}

}
