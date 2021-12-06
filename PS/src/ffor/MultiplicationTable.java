package ffor;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		for(int i=1; i<10; i++) {
			int result = number*i;
			System.out.println(number+" * "+i+" = " + result );
		}

	}

}
