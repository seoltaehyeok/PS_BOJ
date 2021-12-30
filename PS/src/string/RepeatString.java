package string;

import java.util.Scanner;

public class RepeatString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int Case = in.nextInt();
		for(int i=0; i<Case; i++) {
			
			int R = in.nextInt();
			String str = in.next();
			
			
			for(int j=0; j<str.length(); j++) {
				for(int k=0; k<R; k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
		
	}

}
