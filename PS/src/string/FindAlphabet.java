package string;

import java.util.Scanner;

public class FindAlphabet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		
		int arr[] = new int[26];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}	
		
		for(int i=0; i<S.length(); i++) {
			char ch = S.charAt(i);
			
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		
		for(int var : arr) {
			System.out.print(var + " ");
		}
	}
}
