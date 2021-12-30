package wwhile;

import java.util.Scanner;

public class PlusCycle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int copyN = N;
		int count=0;
		
		do {
			N = ((N%10) * 10) + (((N/10) + (N%10)) % 10);
			count++;
		} while (copyN!=N);
		System.out.println(count);
	}
}
