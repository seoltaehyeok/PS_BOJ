package string;

import java.util.Scanner;

public class Dial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String DialText = sc.nextLine();
		char[] ch = new char[DialText.length()];
		
		int time = 0;
		
		for(int i=0; i<DialText.length(); i++) {
			ch[i] = DialText.charAt(i);
			if(ch[i]-'A'<3) {
				time+=3;
			}
			else if(ch[i]-'A'<6) {
				time+=4;
			}
			else if(ch[i]-'A'<9) {
				time+=5;
			}
			else if(ch[i]-'A'<12) {
				time+=6;
			}
			else if(ch[i]-'A'<15) {
				time+=7;
			}
			else if(ch[i]-'A'<19) {
				time+=8;
			}
			else if(ch[i]-'A'<22) {
				time+=9;
			}
			else {
				time+=10;
			}
		}
		System.out.println(time);

	}

}
