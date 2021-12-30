package string;

import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char str = in.nextLine().charAt(0);
		int ascii = (int)str;
		System.out.println(ascii);

	}

}
