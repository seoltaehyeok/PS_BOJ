package string;

import java.util.Scanner;

public class VocaStudy {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String S = in.next();
		int arr[] = new int[26];
		
		
		for(int i=0; i<S.length(); i++) {
		
			if(S.charAt(i)>=65 && S.charAt(i)<=90) {
				arr[S.charAt(i) - 'A']++;
			}
			else {
				arr[S.charAt(i) - 'a']++;
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i=0; i<26; i++) {
			if(arr[i]>max) {
				max = arr[i];
				ch = (char) (i + 65);
			}
			else if(arr[i] == max) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
	}

}

//public class VocaStudy {
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		String S = in.next();
//		int arr[] = new int[26];
//		int max = -1000000;
//		for(int i=0; i<S.length(); i++) {
//			
//			char a = S.charAt(i);
//			
//			if(a>='a' && a<='z')
//			a = (char)(a-32);
//			
//			arr[a]+=1;		
//		}
//		for(int i=65; i<91; i++) {
//			if(arr[i]>max) {
//				max = arr[i];
//			}
//		}
//		System.out.println((char)(max));
//	}
//
//}
